package stom.com.recommend_movie.batch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActorDto {
    private String actorNm;
    private String actorId;

    @Builder
    public ActorDto(String actorNm, String actorId) {
        this.actorNm = actorNm;
        this.actorId = actorId;
    }
}
