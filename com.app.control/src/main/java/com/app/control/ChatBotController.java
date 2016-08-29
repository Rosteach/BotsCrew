package com.app.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.chatbot.util.Action;
import com.app.chatbot.util.MessageGen;

import com.app.chatbot.util.RequestParserUtil;
import com.app.chatbot.util.ResponseUtil;
import com.app.entity.Book;
import java.util.Map;
@RestController
@RequestMapping(value= "/books")
public class ChatBotController{
	@Autowired
	private MessageGen gen;
	
	/**
	 * method to get data from user and send response
	 * it's an example method don't use such construction of REST in production 
	 * and of course to send value by @RequestHeader - POST method needed for @RequestBody mapping
	 * */
	@RequestMapping(value="/", method=RequestMethod.GET, produces={"application/json; charset=UTF-8"})
	public ResponseEntity<ResponseUtil> getSomeAnswer(@RequestHeader("key") String request){
		Map<Action,Book> map= new RequestParserUtil(request).getRequestParam();
		Action act = null;
		
		for(Action action: map.keySet()){
			act = action;
			break;
		}
		return new ResponseEntity<ResponseUtil>(new ResponseUtil("bot:",gen.getMessage(act, map.get(act))),HttpStatus.OK);
	}
}
