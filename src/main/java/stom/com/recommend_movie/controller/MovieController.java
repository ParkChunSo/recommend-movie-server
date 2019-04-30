package stom.com.recommend_movie.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.util.OpenApiConstants;

import java.io.IOException;

@RestController
public class MovieController {
//    @Autowired
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/list")
    public void getMovieList(){

    }

    @GetMapping("/detail")
    public void getMovieDetail(){

    }

    @GetMapping("/test")
    public String test() throws IOException {
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
//        restTemplate.setMessageConverters(Collections.singletonList(new MappingJackson2HttpMessageConverter()));
//        String forObject = restTemplate.getForObject(urlBuilder.toString(), String.class);
        Object forObject = restTemplate.getForEntity(OpenApiConstants.setRequestReleaseDtsAndDte("20180101", "20180201"), MovieDto.class);
//        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//        MovieDto kmdbMovieDto = objectMapper.readValue(forObject, MovieDto.class);
        return forObject.toString();
    }
}
