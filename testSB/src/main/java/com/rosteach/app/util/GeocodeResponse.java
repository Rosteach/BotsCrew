package com.rosteach.app.util;

import org.springframework.web.client.RestTemplate;

import org.json.JSONObject;

public class GeocodeResponse {
	private RestTemplate restTemplate = new RestTemplate();
	
	public GeocodeResponse(){}
	
	public String getLocationJson(String locationName){
		
		String jsonGeocodeResponse=restTemplate.getForObject(RestTemplateURLUtil.getGeocodeApiURL(locationName, "AIzaSyBu5crncAYrbR9LTyEtLFtzRB2viEIgMdA"),String.class);
		JSONObject json = new JSONObject(jsonGeocodeResponse);
		return json.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").toString();
	}
}
