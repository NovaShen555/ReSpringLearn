import org.junit.jupiter.api.Test;
import top.novashen.dao.UserDaoImpl;
import top.novashen.dao.UserDaoImpl2;
import top.novashen.service.UserService;
import top.novashen.service.UserServiceImpl;

public class UserTest {
    @Test
    public void t(){
        UserService userService = new UserServiceImpl();
        //使用set将选择延后
        userService.setUserDao(new UserDaoImpl2());
        userService.getUser();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
