package stom.com.recommend_movie.batch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import stom.com.recommend_movie.batch.dto.StaffDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StaffDtoDeserializer extends JsonDeserializer<List<StaffDto>> {
    private final ObjectMapper objectMapper;

    public StaffDtoDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<StaffDto> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = objectMapper.readTree(jsonParser);
        List<StaffDto> staffs = new ArrayList<>();
        for(int i = 0 ; i < node.size(); i++) {
            JsonNode jsonNode = node.get(i);
            staffs.add(
                    StaffDto.builder()
                            .staffRole(jsonNode.get("staffRole").asText())
                            .staffEtc(jsonNode.get("staffEtc").asText())
                            .staffId(jsonNode.get("staffId").asText())
                            .staffNm(jsonNode.get("staffNm").asText())
                            .staffRoleGroup(jsonNode.get("staffRoleGroup").asText())
                            .build()
            );
        }
        return staffs;
    }
}
