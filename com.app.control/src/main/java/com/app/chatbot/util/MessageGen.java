package com.app.chatbot.util;

public class MessageGen {
	Action action;
	
	public MessageGen(Action action){
		this.action = action;
	}
	
	public String getMessage(String book){
		String answer = null;
		switch(action){
			case ADD:
				answer = "book: "+book+" - was added";
				break;
			case EDIT:
				answer = "book: "+book+" - was added";
				break;
			case REMOVE:
				answer = "book: "+book+" - was removed";
				break;
			case ALL:
				answer = "all books for you: "+book+" - was added";
				break;
			case ALLWITHORDER:
				answer = "all books for you: "+book+" - was added";
				break;
		}
		return answer;
	}
}
