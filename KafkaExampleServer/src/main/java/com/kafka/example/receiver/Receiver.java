package com.kafka.example.receiver;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

import com.kafka.example.model.Message;

public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	@KafkaListener(topics = "mytopic3")
	public void receive(Message payload, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Integer key,
	        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
	        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
	        @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts) {
		System.out.println(payload.toString());
		latch.countDown();
	}

}
