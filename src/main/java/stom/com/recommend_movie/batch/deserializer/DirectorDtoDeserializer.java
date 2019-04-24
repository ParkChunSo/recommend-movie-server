package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.batch.dto.DirectorDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectorDtoDeserializer extends JsonDeserializer<List<DirectorDto>> {
    private final ObjectMapper objectMapper;

    public DirectorDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<DirectorDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<DirectorDto> directors = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            directors.add(
                    DirectorDto.builder()
                            .directorId(jsonNode.get("directorId").asText())
                            .directorNm(jsonNode.get("directorNm").asText())
                            .build()
            );
        }
        return directors;
    }
}