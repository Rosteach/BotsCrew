package com.app.chatbot.util;

public class MessageUtil {
	private Action action;
		
	public MessageUtil(){}

	public MessageUtil(Action action) {
		this.action = action;
	}


	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
}
