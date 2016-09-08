package com.rosteach.app.response;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.XML;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import org.xml.sax.SAXException;
import com.rosteach.app.util.RestTemplateURLUtil;

public class GeocodeResponse {
	private RestTemplate restTemplate;
	
	public GeocodeResponse(){
		this.restTemplate=new RestTemplate();
	}
	public String getGeoCodeData(String mediaType,String locationName) throws ParserConfigurationException, SAXException, IOException{
		String geocode=restTemplate.getForObject(RestTemplateURLUtil.getGeocodeApiURL(mediaType,locationName, "AIzaSyBu5crncAYrbR9LTyEtLFtzRB2viEIgMdA"),String.class);
		String location = getLocationData(geocode,mediaType);
		return location;
	}
	public static String getLocationData(String geocode,String mediaType) throws ParserConfigurationException, SAXException, IOException{
		String locationData=null;
		if(mediaType.equalsIgnoreCase("xml")){
			JSONObject jobj = XML.toJSONObject(geocode);
			String location = jobj.getJSONObject("GeocodeResponse").getJSONObject("result").getJSONObject("geometry").getJSONObject("location").toString();
			System.out.println(XML.toString(new JSONObject(location)));
			return "<geolocation>"+XML.toString(new JSONObject(location))+"</geolocation>";
		}else{
			locationData=String.valueOf(new JSONObject(geocode).getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location"));
		}
		return locationData;
	}
}
