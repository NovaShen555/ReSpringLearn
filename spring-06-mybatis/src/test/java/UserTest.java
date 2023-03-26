import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.Util.MybatisUtils;
import top.novashen.mapper.UserMapper;

public class UserTest {
    @Test
    public void t1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getAllUser().forEach(System.out::println);
    }

    @Test
    public void t2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("userMapper", UserMapper.class).getAllUser().forEach(System.out::println);
    }
}
