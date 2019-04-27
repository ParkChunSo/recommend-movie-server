package stom.com.recommend_movie.batch.config.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.domain.dto.open_api.ResultDto;

import java.io.IOException;
import java.util.List;

public class ResultDtoDeserializer extends JsonDeserializer<List<ResultDto>> {
    private final ObjectMapper objectMapper;

    public ResultDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<ResultDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<ResultDto> result = objectMapper.convertValue(node.findValue("result"), new TypeReference<List<ResultDto>>(){});
        return result;
    }
}
