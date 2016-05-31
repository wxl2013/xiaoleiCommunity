package com.java.xiaoleiCommunity.dao.impl;

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

}
