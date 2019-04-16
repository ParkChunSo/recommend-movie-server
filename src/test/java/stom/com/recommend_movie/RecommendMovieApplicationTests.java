package stom.com.recommend_movie;

import kr.or.kobis.kobisopenapi.consumer.rest.KobisOpenAPIRestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecommendMovieApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        KobisOpenAPIRestService kobisOpenAPIRestService =  new KobisOpenAPIRestService("0ae7692cc04f7c6224318dbc3596b4ca");
        Map map = new HashMap();
        map.put("curPage", "0");
        map.put("itemPerPage", "100");
//        map.put("openStartDt", "2018");
        String movieList = kobisOpenAPIRestService.getMovieList(true, map);
        System.out.println(movieList);
    }

}
