package com.kafka.example.service.impl;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafka.example.model.Message;
import com.kafka.example.sender.Sender;
import com.kafka.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
//	@Value("${spring.kafka.topic.userCreated}")
//	private static String USER_CREATED_TOPIC;
	 
	@Autowired
	private Sender sender;
	
	private Vector<Message> list = new Vector<Message>();
	 
	@Override
	public Message registerUser(Message input) {
			list.add(input);
			sender.send("mytopic", input);
			return input;
	}

	@Override
	public Vector<Message> findAll() {
		return list;
	}
}