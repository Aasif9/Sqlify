package com.example.SQL_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
     // it will not create an object of the interface
    // it will create the bean of the class which is implementing the interface which is the SimpleJpaRepository class
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);

        return "User added successfully";
    }

    public User getUser(int id){
        //Help you find the entity by primary key
        return userRepository.findById(id).get();
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
