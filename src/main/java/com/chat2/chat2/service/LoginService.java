package com.chat2.chat2.service;

import com.chat2.chat2.component.Users;
import com.chat2.chat2.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    boolean logged;
    Users loggedUser;
    UsersRepository usersRepository;

    public LoginService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public boolean login(String name, String password){
        Users user = usersRepository.findUserByName(name);
        if (user == null){
            return false;
        }
        if (!user.getPassword().equals(password)){
            return false;
        }
        loggedUser = user;
        logged = true;
        return true;
    }

    public boolean isIfLogged() {
        return logged;
    }
    public String getUserName(){
        if (isIfLogged()){
            return loggedUser.getName();
        }
        return "niezalogowany";
    }
}
