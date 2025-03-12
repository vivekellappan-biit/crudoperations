package com.vivek.crudoperations.service;

import com.vivek.crudoperations.model.User;

import java.util.List;

public interface UserService {
    User insertUser(User user);
    User findById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void  deleteUser(Long id);
}
