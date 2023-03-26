import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.mapper.UserMapper;

public class UserTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("userMapper", UserMapper.class).getAllUser().forEach(System.out::println);
    }
}
