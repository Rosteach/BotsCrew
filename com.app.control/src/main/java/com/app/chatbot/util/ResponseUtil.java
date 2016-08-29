package com.app.chatbot.util;

public class ResponseUtil {
	private String role;
	private String message;
	
	public ResponseUtil(){}
	public ResponseUtil(String role, String message){
		this.role=role;
		this.message=message;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
