package com.kafka.example.receiver;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

import com.kafka.example.model.Message;

public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	@KafkaListener(topics = "mytopic")
	public void receive(Message payload) {
		System.out.println(payload.toString());
		latch.countDown();
	}

}
