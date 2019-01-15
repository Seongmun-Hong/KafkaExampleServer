package com.kafka.example.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.kafka.example.model.Message;

public class Sender {
	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;

	public void send(String topic, Message payload) {
			kafkaTemplate.send(topic, payload);
	}
}