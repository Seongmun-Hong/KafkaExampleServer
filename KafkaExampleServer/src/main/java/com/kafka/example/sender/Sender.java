package com.kafka.example.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.kafka.example.model.User;

public class Sender {
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	public void send(String topic, User payload) {
			kafkaTemplate.send(topic, payload);
	}
}