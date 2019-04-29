package stom.com.recommend_movie.batch.item;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.util.OpenApiConstants;

@Slf4j
@Component
public class OpenApiItemReader implements ItemStreamReader<MovieDto> {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public OpenApiItemReader(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public MovieDto read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        log.info("=========ItemReader.read() 실행=========");
        String forObject = restTemplate.getForObject(OpenApiConstants.setRequestReleaseDtsAndDte("20180101", "20180201"), String.class);
        return objectMapper.readValue(forObject, MovieDto.class);
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
