/**
 * @author Rosteach
 * class wich parse our input message
 */

package com.app.chatbot.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.entity.Book;

public class RequestParserUtil {
	private String request;
	
	public RequestParserUtil(){}
	public RequestParserUtil(String request){
		this.request=request;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	/**
	 * method to parse request string
	 * @return Map<Action,Book>
	 */
	public Map<Action,Book> getRequestParam(){
		Map<Action,Book> map=new HashMap<Action,Book>();
		if(request.equals("")){
			map.put(Action.EMPTY,null);
			return map;
		}
		
		List<String> list = parseRequest(request);
		
		Book book = new Book();
		Action act = null;
		
			for(String word: list){
				if(word.matches("\\d+")){
					map.put(Action.UNDIFINED,null);
					return map;
				}
				int optionPos = 0;
				for(Action action: Action.values()){
					System.out.println(action.name());
					System.out.println("-------------"+word.toUpperCase().equals(Action.EDIT));
					if(word.toUpperCase().equals(action.name())){
						
						act=action;
						optionPos=list.indexOf(word);
						break;
					}
				}
				for(int i = 0;i<word.length();i++){
					if(word.startsWith("'")){
						book.setName(word.substring(1,word.length()-1));
					}
					else if(list.indexOf(word)!=optionPos&!word.startsWith("'")){
						book.setAuthor(word);
					}
				}
				map.put(act,book);
			}
		return map;
	} 
	/**
	 * method to parse request string
	 * @return Map<Action,Book>
	 */
	public static List<String> parseRequest(String request){
		List<String> list = new ArrayList<String>();
		for(String part: request.split(" ")){
			list.add(part);
		}
		return list;
	}
}
