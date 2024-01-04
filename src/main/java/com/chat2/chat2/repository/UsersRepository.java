package com.chat2.chat2.repository;

import com.chat2.chat2.component.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersRepository {

    public List<Users> users = new ArrayList<>();

    public void addUser(Users user){
        users.add(user);
        System.out.println(users);
    }

    public Users findUserByName(String name){
        for (Users user: users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
}
