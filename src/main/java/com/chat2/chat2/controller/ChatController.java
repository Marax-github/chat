package com.chat2.chat2.controller;

import com.chat2.chat2.service.ChatService;
import com.chat2.chat2.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    LoginService loginService;
    ChatService chatService;

    public ChatController(LoginService loginService, ChatService chatService) {
        this.loginService = loginService;
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String getChatPage(Model model){
        if (loginService.isIfLogged()){
            model.addAttribute("name",loginService.getUserName());
        }
        return "chat";
    }
    @PostMapping("/addMessage")
    public String addMessage(String newMessage){
        chatService.addMessage(newMessage);
        return "redirect:/chat";
    }

}
