package stom.com.recommend_movie.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor
@Table(name = "genres_tbl")
public class Genres {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String genre;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
