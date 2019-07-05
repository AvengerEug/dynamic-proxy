package com.eugene.dynamic.proxy.dao.impl;

import com.eugene.dynamic.proxy.dao.UserDao;
import com.eugene.dynamic.proxy.exception.BusinessException;
import com.eugene.dynamic.proxy.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) throws BusinessException {
        System.out.printf("添加用户, userName: [ " + user.getName() + " ]");
        throw new BusinessException("参数异常", "9999");
    }

    @Override
    public void test() throws BusinessException {
        System.out.println("test 方法");
    }
}
