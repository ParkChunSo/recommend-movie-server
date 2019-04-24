package stom.com.recommend_movie.batch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stom.com.recommend_movie.batch.deserializer.DataDtoDeserializer;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MovieDto {
    @JsonProperty("Query")
    private String query;

    @JsonProperty("KMAQuery")
    private String kmaQuery;

    @JsonProperty("TotalCount")
    private int totalCount;

    @JsonProperty("Data")
    @JsonDeserialize(using = DataDtoDeserializer.class)
    private List<DataDto> data = new ArrayList<>();

    @Builder
    public MovieDto(String query, String kmaQuery, int totalCount, List<DataDto> data) {
        this.query = query;
        this.kmaQuery = kmaQuery;
        this.totalCount = totalCount;
        this.data = data;
    }
}
