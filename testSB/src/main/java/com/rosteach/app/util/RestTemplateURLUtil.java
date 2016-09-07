package com.rosteach.app.util;

public class RestTemplateURLUtil {
	private static final String GOOGLE_API_GEOCODE_URL = "https://maps.googleapis.com/maps/api/geocode/";
	
	public static String getGeocodeApiURL(String mediaType,String locationName, String apiKey){
		return GOOGLE_API_GEOCODE_URL+mediaType+"?address="+locationName+"&key="+apiKey;
	}
}
