package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import stom.com.recommend_movie.batch.dto.DataDto;
import stom.com.recommend_movie.batch.dto.MovieDto;

import java.io.IOException;
import java.util.List;

public class MovieDeserializer extends JsonDeserializer<MovieDto> {
    private final ObjectMapper objectMapper;

    public MovieDeserializer() {
        this.objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
//        simpleModule.addDeserializer(DataDto.class, new DataDtoDeserializer());
        this.objectMapper.registerModule(simpleModule);
    }

    @Override
    public MovieDto deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode jsonNode = objectCodec.readTree(jsonParser);

        String query = jsonNode.get("query").asText();
        String kmaQuery = jsonNode.get("kmaQuery").asText();
        int totalCount = jsonNode.get("totalCount").asInt();
        List<DataDto> data = objectMapper.convertValue(jsonNode.get("data"), new TypeReference<List<DataDto>>(){});

        return MovieDto.builder()
                .query(query)
                .kmaQuery(kmaQuery)
                .totalCount(totalCount)
                .data(data)
                .build();

    }
}
