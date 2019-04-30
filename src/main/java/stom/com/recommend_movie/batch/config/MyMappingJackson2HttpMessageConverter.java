package stom.com.recommend_movie.batch.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class MyMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    public MyMappingJackson2HttpMessageConverter() {
//        List<MediaType> typeList = Arrays.asList(
//                new MediaType("text", "html", DEFAULT_CHARSET),
//                new MediaType("application", "json", DEFAULT_CHARSET),
//                new MediaType("application", "*+json", DEFAULT_CHARSET)
//                Collections.singletonList(MediaType.ALL)
//        );
//        super.setSupportedMediaTypes(typeList);
        super.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
    }
}
