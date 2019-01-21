package com.kafka.example.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kafka.example.model.Message;
import com.kafka.example.service.UserService;

@Controller
public class KafkaController {

	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	@Autowired
	KafkaTemplate kafkaTemplate;

	@Autowired
	UserService userService;

//	@RequestMapping("/kafka")
//	@ResponseBody
//	public String request(@RequestParam(value = "message", required = true, defaultValue = "") String message) {
//
//		LocalDateTime date = LocalDateTime.now();
//		String dateStr = date.format(fmt);
//		kafkaTemplate.send("mytopic", dateStr + "   " + message);
//		return "kafkaTemplate.send >>  " + message;
//	}

	@RequestMapping(method = RequestMethod.GET, path = "/message")
	public ResponseEntity<Vector<Message>> getAll() {
		
		Vector<Message> all = userService.findAll();
		
		if (all != null) {
			for (int i = 0; i < all.size(); i++) {
				all.get(i).toString();
			}
		}
		
		return new ResponseEntity<>(all, HttpStatus.OK);
		
	}

	@RequestMapping(method = RequestMethod.POST, path = "/message")
	public ResponseEntity<Message> register(@RequestBody Message input) {
		Message result = userService.registerUser(input);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
