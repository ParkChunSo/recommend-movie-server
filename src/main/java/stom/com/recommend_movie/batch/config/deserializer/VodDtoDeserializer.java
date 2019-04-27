package stom.com.recommend_movie.batch.config.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.domain.dto.open_api.VodDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VodDtoDeserializer extends JsonDeserializer<List<VodDto>> {
    private final ObjectMapper objectMapper;

    public VodDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<VodDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<VodDto> vods = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            vods.add(
                    VodDto.builder()
                            .vodClass(jsonNode.get("vodClass").asText())
                            .vodUrl(jsonNode.get("vodUrl").asText())
                            .build()
            );
        }
        return vods;
    }
}
