package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "vod")
public class VodDto {
    private String vodClass;
    private String vodUrl;

    @Builder
    public VodDto(String vodClass, String vodUrl) {
        this.vodClass = vodClass;
        this.vodUrl = vodUrl;
    }
}
