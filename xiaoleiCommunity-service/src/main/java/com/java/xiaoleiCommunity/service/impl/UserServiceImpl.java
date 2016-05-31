package com.java.xiaoleiCommunity.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.xiaoleiCommunity.bean.User;
import com.java.xiaoleiCommunity.dao.UserDao;
import com.java.xiaoleiCommunity.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;

    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
