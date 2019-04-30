package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stom.com.recommend_movie.batch.config.deserializer.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "Result")
public class ResultDto {
    @JsonProperty("DOCID")
    private String docid;
    private String movieId;
    private String movieSeq;
    private String title;
    private String titleEng;
    private String titleOrg;
    private String titleEtc;
    private String prodYear;
    @JsonDeserialize(using = DirectorDtoDeserializer.class)
    private List<DirectorDto> director = new ArrayList<>();
    @JsonDeserialize(using = ActorDtoDeserializer.class)
    private List<ActorDto> actor = new ArrayList<>();
    private String nation;
    private String company;
    private String plot;
    private String runtime;
    @JsonDeserialize(using = RatingDtoDeserializer.class)
    private List<RatingDto> rating = new ArrayList<>();
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
    @JsonDeserialize(using = StaffDtoDeserializer.class)
    private List<StaffDto> staff = new ArrayList<>();
    @JsonDeserialize(using = VodDtoDeserializer.class)
    private List<VodDto> vod = new ArrayList<>();
    private String openThtr;
    @JsonDeserialize(using = StatDtoDeserializer.class)
    private List<StatDto> stat = new ArrayList<>();
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
