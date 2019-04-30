package stom.com.recommend_movie.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity @Getter
@NoArgsConstructor
@Table(name = "director_tbl")
public class Director {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String directorId;

    private String directorName;

    @OneToMany(mappedBy = "director")
    private List<Movie> movies;

    @Builder
    public Director(String directorId, String directorName, List<Movie> movies) {
        this.directorId = directorId;
        this.directorName = directorName;
        this.movies = movies;
    }
}
