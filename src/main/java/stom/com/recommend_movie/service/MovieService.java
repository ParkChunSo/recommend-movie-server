package stom.com.recommend_movie.service;

import org.springframework.stereotype.Service;
import stom.com.recommend_movie.domain.dto.open_api.DataDto;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.domain.dto.open_api.ResultDto;
import stom.com.recommend_movie.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public void testSaveMovieData(MovieDto movieDto){
        List<DataDto> data = movieDto.getData();
        List<Movie> movieList = new ArrayList<>();

        for(int i = 0; i < data.size() ; i++){
            List<ResultDto> result = data.get(i).getResult();
            for(int j = 0 ; j < result.size() ; j++){
                movieList.add(
                  Movie.builder()

                          .build()
                );
            }
        }

    }
}
