package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.batch.dto.StatDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StatDtoDeserializer extends JsonDeserializer<List<StatDto>> {
    private final ObjectMapper objectMapper;

    public StatDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<StatDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<StatDto> stats = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            stats.add(
                    StatDto.builder()
                            .audiAcc(jsonNode.get("audiAcc").asText())
                            .salesAcc(jsonNode.get("salesAcc").asText())
                            .screenArea(jsonNode.get("screenArea").asText())
                            .screenCnt(jsonNode.get("screenCnt").asText())
                            .statDate(jsonNode.get("statDate").asText())
                            .statSouce(jsonNode.get("statSouce").asText())
                            .build()
            );
        }
        return stats;
    }
}
