package stom.com.recommend_movie.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_and_actor_tbl")
public class MovieAndActor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;
}
