package com.kafka.example.service;

import java.util.Vector;

import com.kafka.example.model.User;

public interface UserService {
    User registerUser(User input);
    Vector<User> findAll();
}