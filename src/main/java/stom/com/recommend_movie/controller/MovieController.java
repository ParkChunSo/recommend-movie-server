package stom.com.recommend_movie.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import stom.com.recommend_movie.domain.dto.open_api.MovieDto;
import stom.com.recommend_movie.util.OpenApiConstants;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

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
    public MovieDto test() throws IOException {
        String SECRET_KEY = "B47C3DM0LF8H32J5ZQPF";
        String BASE_URL = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp";
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());

        Map<String, String> param = new HashMap();
        param.put("ServiceKey", SECRET_KEY);
        StringBuilder urlBuilder = new StringBuilder("http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp?collection=kmdb_new&nation=대한민국"); //*URL*//*
//        urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8")+ "=B47C3DM0LF8H32J5ZQPF"); //*Service Key*//*listCount
        urlBuilder.append("&ServiceKey=B47C3DM0LF8H32J5ZQPF"); //*Service Key*//*listCount
//        urlBuilder.append("&" + URLEncoder.encode("listCount", "UTF-8") + "=1000"); //*상영년도*//*
        urlBuilder.append("&" + URLEncoder.encode("listCount", "UTF-8") + "=1000"); //*상영년도*//*
        urlBuilder.append("&" + URLEncoder.encode("releaseDts", "UTF-8") + "=" + URLEncoder.encode("20180101", "UTF-8")); //*상영년도*//*
        urlBuilder.append("&" + URLEncoder.encode("releaseDte", "UTF-8") + "=" + URLEncoder.encode("20180201", "UTF-8")); //*상영 월*//*

//        String forObject = restTemplate.getForObject(urlBuilder.toString(), String.class);
        String forObject = restTemplate.getForObject(OpenApiConstants.setRequestReleaseDtsAndDte("20180101", "20180201"), String.class);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        MovieDto kmdbMovieDto = objectMapper.readValue(forObject, MovieDto.class);
        return kmdbMovieDto;
    }
}
