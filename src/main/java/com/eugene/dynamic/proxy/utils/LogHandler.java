package com.eugene.dynamic.proxy.utils;

import com.eugene.dynamic.proxy.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private UserDao userDao;

    public LogHandler(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始记录日志");

        try {
            method.invoke(userDao, args);
        } catch (Exception e) {
            // 获取真实的异常信息
            throw e.getCause();
        }

        System.out.println("记录日志完毕");

        return null;
    }
}
