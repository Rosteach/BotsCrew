package com.app.control;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.chatbot.util.Action;
import com.app.chatbot.util.MessageGen;
import com.app.chatbot.util.Response;

//import com.app.dao.BooksStoreService;

@RestController
@RequestMapping(value= "/books")
public class ChatBotController{
	/*@Autowired
	private BooksStoreService service;*/
	
	/**
	 * method to get data from user and send response 
	 * */
	@RequestMapping(value="/", method=RequestMethod.GET, produces={"application/json; charset=UTF-8"})
	public ResponseEntity<Response> getSomeAnswer(@RequestHeader("key") String request){
		System.out.println("-----------------"+request);
		System.out.println(Action.ADD);
		System.out.println(Action.valueOf("ADD"));
		String res = null;
		for(int i=0;i<request.length();i++){
			char temp=' ';
			if(request.charAt(i)==temp){
				res=request.substring(0,i).toUpperCase();
			}
		}
		System.out.println("-----------"+res);
		//System.out.println("-----------"+Action.valueOf(res).toString());
	
		return new ResponseEntity<Response>(new Response("bot:",new MessageGen(Action.valueOf(res)).getMessage("Harry Potter")),HttpStatus.OK);
	}
}
