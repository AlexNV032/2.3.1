package com.alexnv.service;

import com.alexnv.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}