package com.java.xiaoleiCommunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.xiaoleiCommunity.bean.User;
import com.java.xiaoleiCommunity.service.UserService;

@Controller
//@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/register.html",method=RequestMethod.POST)
    public String register(User user) {
        try {
            user.setStatus(0);
            user.setLevelId(1);
            userService.insertUser(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    
    @RequestMapping(value="/login.html",method=RequestMethod.POST)
    public String validLogin(@RequestParam("username")String username,@RequestParam("password")String password,Model model){
        User user = userService.validateUser(username, password);
        if (user == null) {
            return "error";
        }
        model.addAttribute("username",username);
        return "success";
    }
}
