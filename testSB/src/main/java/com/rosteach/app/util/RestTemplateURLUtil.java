package com.rosteach.app.util;

public class RestTemplateURLUtil {
	private static final String GOOGLE_API_GEOCODE = "https://maps.googleapis.com/maps/api/geocode/json";
	
	public static String getGeocodeApiURL(String locationName, String apiKey){
		return GOOGLE_API_GEOCODE+"?address="+locationName+"&key="+apiKey;
	}
}
