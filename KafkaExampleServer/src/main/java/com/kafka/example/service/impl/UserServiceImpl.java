package com.kafka.example.service.impl;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafka.example.model.User;
import com.kafka.example.sender.Sender;
import com.kafka.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
//	@Value("${spring.kafka.topic.userCreated}")
//	private static String USER_CREATED_TOPIC;
	 
	@Autowired
	private Sender sender;
	
	private Vector<User> list = new Vector<User>();
	 
	@Override
	public User registerUser(User input) {
			list.add(input);
			sender.send("mytopic", input);
			return input;
	}

	@Override
	public Vector<User> findAll() {
		return list;
	}
}