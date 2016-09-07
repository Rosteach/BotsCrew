package com.rosteach.app.util;

import org.springframework.web.client.RestTemplate;
public class GeocodeResponse {
	private static RestTemplate restTemplate=new RestTemplate();
	
	public GeocodeResponse(){
	}
	
	public static String getGeoCode(String mediaType,String locationName){
		String geocode=restTemplate.getForObject(RestTemplateURLUtil.getGeocodeApiURL(mediaType,locationName, "AIzaSyBu5crncAYrbR9LTyEtLFtzRB2viEIgMdA"),String.class);
		return geocode;
	}
}
