package stom.com.recommend_movie.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@NoArgsConstructor
@Table(name = "actor_tbl")
public class Actor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actorId;

    private String actorName;

    @OneToMany(mappedBy = "actor")
    private List<MovieAndActor> movieAndActors = new ArrayList<>();

/*    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies = new ArrayList<>();*/
}
