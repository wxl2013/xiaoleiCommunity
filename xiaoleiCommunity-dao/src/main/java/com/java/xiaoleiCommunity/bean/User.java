package com.java.xiaoleiCommunity.bean;

public class User {
    private int userid;
    private String username;
    private String password;
    private String email;
    private int status;
    private int  levelId;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getLevelId() {
        return levelId;
    }
    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }
}
