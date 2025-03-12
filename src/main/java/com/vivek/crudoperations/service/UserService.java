package com.vivek.crudoperations.service;

import com.vivek.crudoperations.model.User;
import com.vivek.crudoperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insertUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public  void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
