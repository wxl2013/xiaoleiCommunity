package com.java.xiaoleiCommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value="login.html",method=RequestMethod.POST)
    public String validLogin(@RequestParam("username")String username,@RequestParam("password")String password,Model model){
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        return "success";
    }
}
