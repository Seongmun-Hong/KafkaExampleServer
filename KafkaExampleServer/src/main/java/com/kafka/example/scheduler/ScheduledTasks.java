//package com.kafka.example.scheduler;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ScheduledTasks {
//
//	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
//
//	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//
//	@Autowired
//	private KafkaTemplate kafkaTemplate;
//
////	@Autowired
////	private KafkaConsumer<String, String> consumer;
//
//	@Autowired
//	private KafkaProducer<String, String> producer;
//
//	 @Scheduled(fixedRate = 1000)
//	 public void reportCurrentTime() {
//	 kafkaTemplate.send("mytopic", "helloworld " + dateFormat.format(new
//	 Date()));
//	 }
//
//	 @KafkaListener(topics = "mytopic")
//	 public void receiveTopic1(ConsumerRecord consumerRecord) {
//	 System.out.println("Receiver on topic1: " + consumerRecord.toString());
//	 }
//
////	@Scheduled(fixedRate = 1000)
////	public void producer() {
////
////		// message 전달
////		producer.send(new ProducerRecord<String, String>("mytopic", "helloworld " + dateFormat.format(new Date())));
////
////		// 종료
////		producer.flush();
////		producer.close();
////	}
////
////	@Scheduled(fixedRate = 1000)
////	public void consumer() {
//////		kafkaTemplate.
////	}
//
//}