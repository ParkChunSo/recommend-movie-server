package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.batch.dto.RatingDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RatingDtoDeserializer extends JsonDeserializer<List<RatingDto>> {
    private final ObjectMapper objectMapper;

    public RatingDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<RatingDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<RatingDto> rating = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            rating.add(
                    RatingDto.builder()
                            .ratingDate(jsonNode.get("ratingDate").asText())
                            .ratingGrade(jsonNode.get("ratingGrade").asText())
                            .ratingMain(jsonNode.get("ratingMain").asText())
                            .ratingNo(jsonNode.get("ratingNo").asText())
                            .releaseDate(jsonNode.get("releaseDate").asText())
                            .runtime(jsonNode.get("runtime").asText())
                            .build()
            );
        }
        return rating;
    }
}
