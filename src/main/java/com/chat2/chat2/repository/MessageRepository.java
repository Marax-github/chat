package com.chat2.chat2.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageRepository {

    List<String> messages = new ArrayList<>();

    public void save(String message){
        messages.add(message);
        System.out.println(messages);
    }

    public List<String> getMessages() {
        return messages;
    }

}
