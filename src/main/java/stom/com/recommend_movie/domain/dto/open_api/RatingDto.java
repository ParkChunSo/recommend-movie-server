package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "rating")
public class RatingDto {
    private String ratingMain;
    private String ratingDate;
    private String ratingNo;
    private String ratingGrade;
    private String releaseDate;
    private String runtime;

    @Builder
    public RatingDto(String ratingMain, String ratingDate, String ratingNo, String ratingGrade, String releaseDate, String runtime) {
        this.ratingMain = ratingMain;
        this.ratingDate = ratingDate;
        this.ratingNo = ratingNo;
        this.ratingGrade = ratingGrade;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
    }
}
