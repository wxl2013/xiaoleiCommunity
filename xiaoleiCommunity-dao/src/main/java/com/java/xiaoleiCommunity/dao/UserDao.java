package com.java.xiaoleiCommunity.dao;

import com.java.xiaoleiCommunity.bean.User;

public interface UserDao {
    void insertUser(User user);
    User validateUser(String username, String password);
}
