package com.java.xiaoleiCommunity.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.xiaoleiCommunity.bean.User;
import com.java.xiaoleiCommunity.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    public void insertUser(User user) {
       sqlSession.insert("com.java.xiaoleiCommunity.bean.User.insertUser", user);
    }

    public User validateUser(String username, String password) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username", username);
        map.put("password", password);
        User user = sqlSession.selectOne("com.java.xiaoleiCommunity.bean.User.getUserByNameAndPass", map);
        return user;
    }

}
