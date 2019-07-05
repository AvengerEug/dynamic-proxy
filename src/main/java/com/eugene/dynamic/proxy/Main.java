package com.eugene.dynamic.proxy;

import com.eugene.dynamic.proxy.dao.UserDao;
import com.eugene.dynamic.proxy.dao.impl.UserDaoImpl;
import com.eugene.dynamic.proxy.model.User;
import com.eugene.dynamic.proxy.utils.LogHandler;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws Exception {

        UserDao userDAO = new UserDaoImpl();
        LogHandler logHandler = new LogHandler(userDAO);

        UserDao userDao = (UserDao) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), logHandler);
        try {
            User user = new User();
            user.setName("123");
            //userDao.addUser(user);

            userDao.test();
        } catch (Exception e) {
            throw e;
        }
    }
}
