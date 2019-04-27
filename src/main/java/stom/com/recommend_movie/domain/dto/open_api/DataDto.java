package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import stom.com.recommend_movie.batch.config.deserializer.ResultDtoDeserializer;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDto {
    @JsonProperty("CollName")
    private String collName;

    @JsonProperty("TotalCount")
    private int totalCount;

    @JsonProperty("Count")
    private int count;

    @JsonProperty("Result")
    @JsonDeserialize(using = ResultDtoDeserializer.class)
    private List<ResultDto> result = new ArrayList<>();

    @Builder
    public DataDto(String collName, int totalCount, int count, List<ResultDto> result) {
        this.collName = collName;
        this.totalCount = totalCount;
        this.count = count;
        this.result = result;
    }
}
