import com.yyyu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/6/26.
 */
public class TestWay1 {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:config/spring/applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println("user==="+user);
    }

}
