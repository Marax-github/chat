package com.chat2.chat2.service;

import com.chat2.chat2.component.Users;
import com.chat2.chat2.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    UsersRepository usersRepository;

    public RegisterService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public boolean register(String name, String password){
        Users users = new Users(name, password);
        if (name.equals("") || password.equals("")){
            System.out.println("nieprawidlowe dane");
            return false;
        }
        System.out.println("Wszystko ok! " + name + " " + password);
        usersRepository.addUser(users);
        return true;
    }

}
