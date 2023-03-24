package top.novashen.service;

import top.novashen.dao.UserDao;

public interface UserService {
    void setUserDao(UserDao userDao);
    void getUser();
}
