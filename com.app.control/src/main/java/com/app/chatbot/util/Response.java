package com.app.chatbot.util;

public class Response {
	private String role;
	private String message;
	
	public Response(){}
	public Response(String role, String message){
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
