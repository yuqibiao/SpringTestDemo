import com.yyyu.spring.pojo.User;
import com.yyyu.spring.pojo.UserOrder;
import com.yyyu.spring.pojo.annotation.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：IOC测试
 *
 * @author yu
 * @date 2017/6/26.
 */
public class TestIOC {

    @Test
    public void test1(){//---通过配置文件的方式创建bean
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:config/spring/applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println("user==="+user);
        UserOrder userOrder = (UserOrder) ac.getBean("userOrder");
        String username = userOrder.getUser().getUsername();
        System.out.println("username==="+username);
        System.out.println("tags==="+userOrder.getUser().getTags());
    }

    @Test
    public void test2(){//---通过注解的方式创建bean
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:config/spring/applicationContext.xml");
        LoginService loginService = (LoginService) ac.getBean("loginService");
        loginService.toLogin();
        ac.close();//---只有人为的关闭ac destroy才会被调用
    }


    @Test
    public void test3(){//---scope属性配置 默认是SingleTon
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:config/spring/applicationContext.xml");
        User user1 = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");
        System.out.println("user1==user2："+(user1==user2));

        /*配置了scope为prototype*/
        UserOrder userOrder1 = (UserOrder) ac.getBean("userOrder");
        UserOrder userOrder2 = (UserOrder) ac.getBean("userOrder");
        System.out.println("userOrder1==userOrder2："+(userOrder1==userOrder2));

    }



}
