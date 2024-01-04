package com.chat2.chat2.service;

import com.chat2.chat2.component.Users;
import com.chat2.chat2.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    MessageRepository messageRepository;

    public ChatService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String addMessage(String newMessage){
        String message =  newMessage;
        messageRepository.save(message);
        return message;
    }

    public List<String> getMessage(){
        return messageRepository.getMessages();
    }
}
