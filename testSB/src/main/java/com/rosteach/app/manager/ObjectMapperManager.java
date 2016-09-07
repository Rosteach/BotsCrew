package com.rosteach.app.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ObjectMapperManager {
	
	public static ObjectMapper getObjectMapper(String mediaType){
		if(mediaType.equalsIgnoreCase("xml")){
			return new XmlMapper();
		}
		else if(mediaType.equalsIgnoreCase("json")){
			return new ObjectMapper();
		}
		else
		return null;
	}
}