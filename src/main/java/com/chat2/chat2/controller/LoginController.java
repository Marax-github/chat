package com.chat2.chat2.controller;

import com.chat2.chat2.component.Users;
import com.chat2.chat2.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String login(String name, String password){
        boolean success = loginService.login(name, password);
        if (success){
            return "login-success";
        }
        return "login-fail";
    }

}
