package stom.com.recommend_movie.batch.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BatchConfig  {

    @Bean
    public RestTemplate restTemplate(){
//        return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        RestTemplate restTemplate = new RestTemplate();
//        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
//        for(HttpMessageConverter httpMessageConverter : messageConverters){
//            httpMessageConverter.
//        }
//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//        Jaxb2RootElementHttpMessageConverter jaxbMessageConverter = new Jaxb2RootElementHttpMessageConverter();
//        List<MediaType> mediaTypes = new ArrayList<MediaType>();
////        mediaTypes.add(MediaType.TEXT_HTML);
//        mediaTypes.add(MediaType.APPLICATION_JSON );
//        jaxbMessageConverter.setSupportedMediaTypes(mediaTypes);
//        messageConverters.add(jaxbMessageConverter);
//        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }



    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    }
}
