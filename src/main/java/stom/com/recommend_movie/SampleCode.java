package stom.com.recommend_movie;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 영화 REST Api 샘플 코드
 * KLDb Api
 *  B47C3DM0LF8H32J5ZQPF
 */
public class SampleCode {
    private static String SECRET_KEY = "B47C3DM0LF8H32J5ZQPF";
    private static String BASE_URL = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp";

    public static void main(String[] args) throws IOException {
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());

        Map<String, String> param = new HashMap();
        param.put("ServiceKey", SECRET_KEY);
        String forObject = restTemplate.getForObject(BASE_URL, String.class, param);
        System.out.println(forObject);


        /*        StringBuilder urlBuilder = new StringBuilder("http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp?collection=kmdb_new&nation=대한민국"); *//*URL*//*
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")+ "=서비스키"); *//*Service Key*//*
        urlBuilder.append("&" + URLEncoder.encode("val001", "UTF-8") + "=" + URLEncoder.encode("2018", "UTF-8")); *//*상영년도*//*
        urlBuilder.append("&" + URLEncoder.encode("val002", "UTF-8") + "=" + URLEncoder.encode("01", "UTF-8")); *//*상영 월*//*
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());*/




    }
}