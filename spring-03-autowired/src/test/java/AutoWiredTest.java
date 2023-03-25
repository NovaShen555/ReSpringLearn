import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.pojo.Human;


public class AutoWiredTest {
    @Test
    public void t1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Human human = context.getBean("human", Human.class);
        System.out.println(human);
    }


}
