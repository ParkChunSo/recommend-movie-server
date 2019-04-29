package stom.com.recommend_movie.batch.item;

import org.springframework.batch.item.ItemProcessor;
import stom.com.recommend_movie.domain.dto.open_api.DataDto;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.domain.dto.open_api.ResultDto;
import stom.com.recommend_movie.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class OpenApiItemProcessor implements ItemProcessor<MovieDto, Movie> {

    @Override
    public Movie process(MovieDto movieDto) throws Exception {
        List<DataDto> data = movieDto.getData();
        List<Movie> movieList = new ArrayList<>();

        for(int i = 0; i < data.size() ; i++){
            List<ResultDto> result = data.get(i).getResult();
            for(int j = 0 ; j < result.size() ; j++){

            }
        }
        return null;
    }

}
