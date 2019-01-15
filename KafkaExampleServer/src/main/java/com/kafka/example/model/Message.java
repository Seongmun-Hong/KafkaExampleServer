package com.kafka.example.model;

public class Message {

	private int room;
	
	private String username;

	private String message;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "{  \n" + 
				"   \"room\":" + String.valueOf(room) + ",\n" +
				"   \"username\":\"" + username + "\",\n" + 
				"   \"message\":\"" + message + "\"\n" + 
				"}";
	}
	
	

}
