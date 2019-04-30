package stom.com.recommend_movie.service;

import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Service;
import stom.com.recommend_movie.domain.dto.open_api.DataDto;
import stom.com.recommend_movie.domain.dto.open_api.DirectorDto;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.domain.dto.open_api.ResultDto;
import stom.com.recommend_movie.domain.entity.Director;
import stom.com.recommend_movie.domain.entity.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    public void testSaveMovieData(MovieDto movieDto){
        List<DataDto> data = movieDto.getData();
        List<Movie> movieList = new ArrayList<>();

        for(int i = 0; i < data.size() ; i++){
            List<ResultDto> result = data.get(i).getResult();
            for(int j = 0 ; j < result.size() ; j++){
//                ResultDto resultDto = result.get(j);
//
//                DirectorDto directorDto = resultDto.getDirector().get(0);
//
//                movieList.add(
//                  Movie.builder()
//                          .audiAcc(resultDto.getAudiAcc())
//                          .company(resultDto.getCompany())
//                          .director(Director.builder()
//                                  .directorId(directorDto.getDirectorId())
//                                  .directorName(directorDto.getDirectorNm())
//                                  .build())
//                          .engTitle(resultDto.getTitleEng())
//                          .genres()
//                          .keywords()
//                          .kmdbDataId()
//                          .korTitle(resultDto.getTitle())
//                          .movieAndActor()
//                          .movieId(resultDto.getMovieId())
//                          .movieSeq(resultDto.getMovieSeq())
//                          .nation(resultDto.getNation())
//                          .plot(resultDto.getPlot())
//                          .posterUrl(resultDto.getPosters())
//                          .prodYear(resultDto.getProdYear())
//                          .rating(resultDto.getRating())
//                          .releaseDate(re)
//                          .runtime()
//                          .vodUrl()
//                          .build()
//                );
            }
        }

    }
}
