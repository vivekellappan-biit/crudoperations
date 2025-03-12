package com.vivek.crudoperations.controller;

import com.vivek.crudoperations.model.User;
import com.vivek.crudoperations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User insertUser(@RequestBody User user) {
        return  userService.insertUser(user);
    }

    @DeleteMapping
    public void deleteUserById(Long userId) {
        userService.deleteUserById(userId);
    }

}
