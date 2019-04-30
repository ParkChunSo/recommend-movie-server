package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "director")
public class DirectorDto {
    private String directorNm;
    private String directorId;

    @Builder
    public DirectorDto(String directorNm, String directorId) {
        this.directorNm = directorNm;
        this.directorId = directorId;
    }
}
