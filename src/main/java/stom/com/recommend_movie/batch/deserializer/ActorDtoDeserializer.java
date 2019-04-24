package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.batch.dto.ActorDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActorDtoDeserializer extends JsonDeserializer<List<ActorDto>> {
    private final ObjectMapper objectMapper;

    public ActorDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<ActorDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<ActorDto> actors = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            actors.add(
                    ActorDto.builder()
                            .actorId(jsonNode.get("actorId").asText())
                            .actorNm(jsonNode.get("actorNm").asText())
                            .build()
            );
        }
        return actors;
    }
}