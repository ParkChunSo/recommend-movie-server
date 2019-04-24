package stom.com.recommend_movie.batch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VodDto {
    private String vodClass;
    private String vodUrl;

    @Builder
    public VodDto(String vodClass, String vodUrl) {
        this.vodClass = vodClass;
        this.vodUrl = vodUrl;
    }
}
