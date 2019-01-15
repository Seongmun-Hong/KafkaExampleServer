package com.kafka.example.service;

import java.util.Vector;

import com.kafka.example.model.Message;

public interface UserService {
    Message registerUser(Message input);
    Vector<Message> findAll();
}