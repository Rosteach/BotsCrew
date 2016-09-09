package com.rosteach.app.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ResourceUtil {
	
	public static String getFromJsonAsString(String path) throws IOException, ParseException{
		JSONParser parser = new JSONParser();
		JSONObject jobj = (JSONObject) parser.parse(new FileReader(new File(path)));
		return jobj.get("key").toString();
	}
}
