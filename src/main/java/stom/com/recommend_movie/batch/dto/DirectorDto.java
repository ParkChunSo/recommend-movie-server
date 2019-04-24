package stom.com.recommend_movie.batch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectorDto {
    private String directorNm;
    private String directorId;

    @Builder
    public DirectorDto(String directorNm, String directorId) {
        this.directorNm = directorNm;
        this.directorId = directorId;
    }
}
