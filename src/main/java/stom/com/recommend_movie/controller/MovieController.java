package stom.com.recommend_movie.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import stom.com.recommend_movie.domain.dto.KmdbMovieDto;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
    public KmdbMovieDto test() throws IOException {
        String SECRET_KEY = "B47C3DM0LF8H32J5ZQPF";
        String BASE_URL = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp";
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());

        Map<String, String> param = new HashMap();
        param.put("ServiceKey", SECRET_KEY);
        StringBuilder urlBuilder = new StringBuilder("http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp?collection=kmdb_new&nation=대한민국"); //*URL*//*
        urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8")+ "=B47C3DM0LF8H32J5ZQPF"); //*Service Key*//*
        urlBuilder.append("&" + URLEncoder.encode("val001", "UTF-8") + "=" + URLEncoder.encode("2018", "UTF-8")); //*상영년도*//*
        urlBuilder.append("&" + URLEncoder.encode("val002", "UTF-8") + "=" + URLEncoder.encode("01", "UTF-8")); //*상영 월*//*


/*        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        ResponseEntity<KmdbMovieDto> result = new RestTemplate().exchange(urlBuilder.toString(), HttpMethod.POST, new HttpEntity<>(headers), KmdbMovieDto.class);*/


        String forObject = restTemplate.getForObject(urlBuilder.toString(), String.class);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        KmdbMovieDto kmdbMovieDto = objectMapper.readValue(forObject, KmdbMovieDto.class);
        return kmdbMovieDto;
    }
}
