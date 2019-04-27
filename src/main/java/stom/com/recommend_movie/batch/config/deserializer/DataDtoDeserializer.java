package stom.com.recommend_movie.batch.config.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import stom.com.recommend_movie.domain.dto.open_api.DataDto;
import stom.com.recommend_movie.domain.dto.open_api.ResultDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataDtoDeserializer extends JsonDeserializer<List<DataDto>> {
    private final ObjectMapper objectMapper;

    public DataDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
    }

    @Override
    public List<DataDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<DataDto> dataDtos = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            dataDtos.add(
                    DataDto.builder()
                            .collName(jsonNode.get("CollName").asText())
                            .count(jsonNode.get("Count").asInt())
                            .totalCount(jsonNode.get("TotalCount").asInt())
                            .result(objectMapper.convertValue(jsonNode.get("Result"), new TypeReference<List<ResultDto>>() {}))
                            .build()
            );
        }
        return dataDtos;
    }
}
