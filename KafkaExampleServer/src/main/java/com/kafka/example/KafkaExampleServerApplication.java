package com.kafka.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaExampleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleServerApplication.class, args);
	}

}

