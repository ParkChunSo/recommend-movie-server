package stom.com.recommend_movie.domain.entity;

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
}
