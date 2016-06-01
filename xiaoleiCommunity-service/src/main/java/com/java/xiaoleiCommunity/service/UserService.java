package com.java.xiaoleiCommunity.service;

import com.java.xiaoleiCommunity.bean.User;

public interface UserService {
    void insertUser(User user);
    User validateUser(String username, String password);
}
