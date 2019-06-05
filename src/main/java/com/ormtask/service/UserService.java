package com.ormtask.service;


import com.ormtask.entity.User;
import com.ormtask.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getByName(String login, String pass){
        return userRepository.findByName_users(login);


    }
}
