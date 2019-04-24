package stom.com.recommend_movie.batch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDto {
    private String screenArea;
    private String screenCnt;
    private String salesAcc;
    private String audiAcc;
    private String statSouce;
    private String statDate;

    @Builder
    public StatDto(String screenArea, String screenCnt, String salesAcc, String audiAcc, String statSouce, String statDate) {
        this.screenArea = screenArea;
        this.screenCnt = screenCnt;
        this.salesAcc = salesAcc;
        this.audiAcc = audiAcc;
        this.statSouce = statSouce;
        this.statDate = statDate;
    }
}
