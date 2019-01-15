package com.kafka.example.receiver;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	@KafkaListener(topics = "mytopic")
	public void receive(String payload) {
		//emailService.sendSimpleMessage(payload);
		latch.countDown();
	}

}
