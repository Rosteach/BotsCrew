package com.rosteach.app.utils;

public class RestTemplateURLUtils {
	private static final String GOOGLE_API_GEOCODE = "https://maps.googleapis.com/maps/api/geocode/";
	
	public static String getRestEndPoint(String dataFormat, String locationName, String apiKey){
		return GOOGLE_API_GEOCODE+dataFormat+"?address="+locationName+"&key="+apiKey;
	}
}
