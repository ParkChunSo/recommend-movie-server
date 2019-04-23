package stom.com.recommend_movie.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class KmdbMovieDto {
    @JsonProperty("Query")
    private String query;

    @JsonProperty("KMAQuery")
    private String kmaQuery;

    @JsonProperty("TotalCount")
    private int totalCount;

    @JsonProperty("Data")
    private List<Data> data = new ArrayList<>();
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Data{
    @JsonProperty("CollName")
    private String collName;

    @JsonProperty("TotalCount")
    private int totalCount;

    @JsonProperty("Count")
    private int count;

    @JsonProperty("Result")
    private List<Result> result = new ArrayList<>();
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Result{
    @JsonProperty("DOCID")
    private String docid;
    private String movieId;
    private String movieSeq;
    private String title;
    private String titleEng;
    private String titleOrg;
    private String titleEtc;
    private String prodYear;
    private List<Director> director = new ArrayList<>();
    private List<Actor> actor = new ArrayList<>();
    private String nation;
    private String company;
    private String plot;
    private String runtime;
    private List<Rating> rating = new ArrayList<>();
    private String genre;
    private String kndmUrl;
    private String type;
    private String use;
    private String episodes;
    private String rateYn;
    private String repRatDate;
    private String repRlsDate;
    private String keyword;
    private String posters;
    private String stlls;
    private List<Staff> staff = new ArrayList<>();
    private List<Vod> vod = new ArrayList<>();
    private String openThtr;
    private List<Stat> stat = new ArrayList<>();
    private String screenArea;
    private String screenCnt;
    private String salesAcc;
    private String audiAcc;
    private String statSouce;
    private String statDate;
    private String themeSong;
    private String soundtrack;
    private String fLocation;
    @JsonProperty("Awards1")
    private String awards1;
    @JsonProperty("Awards2")
    private String awards2;
    private String regDate;
    private String modDate;
    private String isanCode;
    private String ALIAS;

}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Director{
    private String directorNm;
    private String directorId;
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Actor{
    private String actorNm;
    private String actorId;
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Rating{
    private String ratingMain;
    private String ratingDate;
    private String ratingNo;
    private String ratingGrade;
    private String releaseDate;
    private String runtime;
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Staff{
    private String staffNm;
    private String staffRoleGroup;
    private String staffRole;
    private String staffEtc;
    private String staffId;
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Vod{
    private String vodClass;
    private String vodUrl;
}

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
class Stat{
    private String screenArea;
    private String screenCnt;
    private String salesAcc;
    private String audiAcc;
    private String statSouce;
    private String statDate;
}