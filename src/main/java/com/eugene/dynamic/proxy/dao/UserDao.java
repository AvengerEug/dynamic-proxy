package com.eugene.dynamic.proxy.dao;

import com.eugene.dynamic.proxy.exception.BusinessException;
import com.eugene.dynamic.proxy.model.User;

public interface UserDao {

    void addUser(User user) throws BusinessException;

    void test() throws BusinessException;
}
