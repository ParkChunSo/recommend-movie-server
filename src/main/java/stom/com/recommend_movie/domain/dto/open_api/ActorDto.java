package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "actor")
public class ActorDto {
    private String actorNm;
    private String actorId;

    @Builder
    public ActorDto(String actorNm, String actorId) {
        this.actorNm = actorNm;
        this.actorId = actorId;
    }
}
