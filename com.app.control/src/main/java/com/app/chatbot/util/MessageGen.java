package com.app.chatbot.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.BooksStoreService;
import com.app.entity.Book;

@Repository
public class MessageGen {

	@Autowired
    BooksStoreService service;
	
	public String getMessage(Action action, Book book){
		String answer = null;
		switch(action){
			case ADD:
				if(book.chekContent()){
					service.add(book);
					answer = "book: "+book.getAuthor()+" '"+book.getName()+"'"+" - was added";
				}
				else{
					answer = "Seems that you want to add some Book but forgot to write an Author or Name! please try again like: add author/unknown 'Book name'";
				}
				break;
			case EDIT:
				answer = "book: "+""+" - was edit";
				break;
			case REMOVE:
				answer = "book: "+""+" - was removed";
				break;
			case ALL:
				String res = "";
				List<Book> books = service.all();
				for(Book b: books){
					System.out.println(b.getInfo());
					res+=b.getInfo()+";  ";
				};
				answer = "all books for you: "+res;
				break;
			case ALLWITHORDER:
				answer = "all books for you: "+""+" - was added";
				break;
			case UNDIFINED:
				answer = "Can you clarify your question? For example : option(add,remove,edit) Author 'Book', or if you want to see all books enter all books!";
				break;
			case EMPTY:
				answer = "Welcome to Book Store! Here you can add,edit,delete,lists Books";
				break;
		}
		return answer;
	}
}
