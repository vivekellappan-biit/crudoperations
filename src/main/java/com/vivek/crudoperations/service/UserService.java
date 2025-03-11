package com.vivek.crudoperations.service;

import com.vivek.crudoperations.entity.User;

import java.util.List;

public interface UserService {
    User insertUser(User user);
    User findByEmail(String email);
    List<User> getAllUsers();
    User updateUser(User user);
    User deleteUser(Long id);
}
