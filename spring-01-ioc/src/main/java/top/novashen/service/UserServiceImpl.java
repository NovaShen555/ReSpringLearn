package top.novashen.service;

import top.novashen.dao.UserDao;

public class UserServiceImpl implements UserService{

//    这种方法非常死板，若是Dao改动则Service源代码需要更改，不适合大型开发
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

//利用set方法将userDao由使用者注入，将配置的选择尽量延后
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
