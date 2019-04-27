package stom.com.recommend_movie.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class OpenApiConstants {
    public static final String SECRET_KEY = "B47C3DM0LF8H32J5ZQPF";
    public static final String REQUEST_BASE_URL = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json.jsp?collection=kmdb_new&listCount=1000&ServiceKey=" + SECRET_KEY;
    public static final String RELEASE_START_DATE_PARAM="&releaseDts=";
    public static final String RELEASE_END_DATE_PARAM="&releaseDte=";

    public static String getRequestReleaseDtsAndDte(String start, String end){
        StringBuilder sb = new StringBuilder(REQUEST_BASE_URL);
        sb.append(RELEASE_START_DATE_PARAM);
        sb.append(start);
        sb.append(RELEASE_END_DATE_PARAM);
        sb.append(end);
        return sb.toString();
    }
}
