package com.example.SQL_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    
    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @GetMapping("/getAllUser")
    public List<User> getALlUser(){
        return userService.getAllUser();
    }


}
