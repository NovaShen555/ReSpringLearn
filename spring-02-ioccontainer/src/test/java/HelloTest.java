import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.pojo.Hello;

public class HelloTest {
    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("CPX created!");
        Hello hello1 = context.getBean("hello1", Hello.class);
        System.out.println("Bean gotten!");
        System.out.println(hello1);
        Hello hello2 = context.getBean("hello1", Hello.class);
        System.out.println(hello2 == hello1);
    }
}
