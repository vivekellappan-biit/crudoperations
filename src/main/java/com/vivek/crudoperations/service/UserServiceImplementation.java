package com.vivek.crudoperations.service;

import com.vivek.crudoperations.model.User;
import com.vivek.crudoperations.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return  optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User oldUser = userRepository.findById(user.getId()).get();
        oldUser.setEmail(user.getEmail());
        return userRepository.save(oldUser);
    }

    @Override
    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }
}
