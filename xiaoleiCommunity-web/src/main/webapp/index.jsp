<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>test</title>
  </head>
  
<body>
<h2>注册</h2><br/>
  <form action="register.html" method="post">
    username: <input type="text" name="username"/><br/>
    password: <input type="password" name="password"/><br/>
    email:    <input type="text" name="email">
    <input type="submit" value="submit"/>
  </form>
  <br/>
    <h2>登陆</h2><br/>
    <form action="login.html" method="post">
    username: <input type="text" name="username"/><br/>
    password: <input type="password" name="password"/><br/>
    <input type="submit" value="login"/>
  </form>
</body>
</html>
