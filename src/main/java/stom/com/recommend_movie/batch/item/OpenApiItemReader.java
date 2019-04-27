package stom.com.recommend_movie.batch.item;

import org.springframework.batch.item.*;
import org.springframework.stereotype.Component;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;

@Component
public class OpenApiItemReader implements ItemStreamReader<MovieDto> {

    @Override
    public MovieDto read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void close() throws ItemStreamException {

    }
}
