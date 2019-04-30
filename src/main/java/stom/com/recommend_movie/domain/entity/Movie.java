package stom.com.recommend_movie.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@NoArgsConstructor
@Table(name = "movie_tbl")
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieId;

    private String movieSeq;

    // 한글 제목
    private String korTitle;

    // 영문 제목
    private String engTitle;

    // 감독 정보
    @ManyToOne
    @JoinColumn(name="director_id")
    private Director director;

    // 배우 정보
    @OneToMany(mappedBy = "movie")
    private List<MovieAndActor> movieAndActor;

    // Kmdb 연결정보
    private String kmdbDataId;

    // 제작국가
    private String nation;

    // 제작사
    private String company;

    // 제작연도
    private int prodYear;

    // 상영시간
    private int runtime;

    // 줄거리
    private String plot;

    // 관람등급
    private String rating;

    // 개봉일
    private LocalDate releaseDate;

    // 키워드
    @OneToMany(mappedBy = "movie")
    private List<Keywords> keywords = new ArrayList<>();

    // 장르
    @OneToMany(mappedBy = "movie")
    private List<Genres> genres = new ArrayList<>();

    // 포스터 이미지 url
    private String posterUrl;

    // 예고, 티져 영상 url
    private String vodUrl;

    // 누적 관람 인원
    private String audiAcc;

    @Builder
    public Movie(String movieId, String movieSeq, String korTitle, String engTitle, Director director, List<MovieAndActor> movieAndActor, String kmdbDataId, String nation, String company, int prodYear, int runtime, String plot, String rating, LocalDate releaseDate, List<Keywords> keywords, List<Genres> genres, String posterUrl, String vodUrl, String audiAcc) {
        this.movieId = movieId;
        this.movieSeq = movieSeq;
        this.korTitle = korTitle;
        this.engTitle = engTitle;
        this.director = director;
        this.movieAndActor = movieAndActor;
        this.kmdbDataId = kmdbDataId;
        this.nation = nation;
        this.company = company;
        this.prodYear = prodYear;
        this.runtime = runtime;
        this.plot = plot;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.keywords = keywords;
        this.genres = genres;
        this.posterUrl = posterUrl;
        this.vodUrl = vodUrl;
        this.audiAcc = audiAcc;
    }
}
/*    @ManyToMany
    @JoinTable(
            name = "movie_actor_tbl",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors = new ArrayList<>();*/