package com.chat2.chat2.controller;

import com.chat2.chat2.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping("/addUser")
    public String register(String name, String password){
        boolean success = registerService.register(name, password);
        if (success){
            return "register-success";
        }
        return "register-fail";
    }
}
