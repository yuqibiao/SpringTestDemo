import com.yyyu.spring.pojo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能：AOP测试
 *
 * @author yu
 * @date 2017/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath*:config/spring/applicationContext_aop.xml"} )//classpath*:config/spring/applicationContext.xml"
public class TestAOP {

    @Autowired
    UserService userService;

    @Test
    public void testBefore(){
        userService.save();
    }

    @Test
    public void testAfter(){
        userService.update();
    }

    @Test
    public void testAround(){
        userService.delete();
    }

}
