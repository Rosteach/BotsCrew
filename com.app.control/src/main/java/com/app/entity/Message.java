package com.app.entity;

public class Message {
	private String option;
	private String bookAuthor;
	private String bookName;
	
	public Message(){}
	
	public Message(String option, String bookAuthor, String bookName) {
		this.option = option;
		this.bookAuthor = bookAuthor;
		this.bookName = bookName;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
}
