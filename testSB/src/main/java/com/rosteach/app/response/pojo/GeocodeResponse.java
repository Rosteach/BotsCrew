package com.rosteach.app.response.pojo;

import java.io.IOException;
import java.util.Iterator;

import org.json.XML;
import org.json.simple.parser.ParseException;
import org.json.JSONObject;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.rosteach.app.util.ResourceUtil;
import com.rosteach.app.util.RestTemplateURLUtil;

public class GeocodeResponse {
	private RestTemplate restTemplate;
	private final String apiKey="C:/Users/admin/git/BotsCrew/testSB/testSB/src/main/resources/static/apikey.json";
	
	public GeocodeResponse(){
		this.restTemplate=new RestTemplate();
	}
	
	/**
	 * method to get String implementation of needed mediaType 
	 * @throws IOException 
	 * @throws RestClientException 
	 * @throws ParseException 
	 */
	public String getGeoCodeData(String mediaType,String locationName) throws RestClientException, IOException, ParseException{
		
		/**
		 * get our String as response from restTemplate
		 */
		String geocode=restTemplate.getForObject(RestTemplateURLUtil.getGeocodeApiURL(mediaType,locationName,ResourceUtil.getFromJsonAsString(apiKey)),String.class);
		
		/**
		 * get our location as String value according to restTemplate result
		 */
		String location = getLocationData(geocode,mediaType);
		
		return location;
	}
	
	/**
	 * method to get String value of location which is the node of dataformat 
	 */
	public static String getLocationData(String geocode,String mediaType){
		String locationData=null;
		if(mediaType.equalsIgnoreCase("xml")){
			JSONObject jobj = XML.toJSONObject(geocode);
			
			JSONObject geometry = jobj.getJSONObject("GeocodeResponse").getJSONObject("result").getJSONObject("geometry");
			
			Iterator<?> keys = geometry.keys();

			while( keys.hasNext() ) {
			    String key = (String) keys.next();
			    if(key.equals("location")){
				   return XML.toString(new JSONObject().put(key, geometry.get(key)));
			    }
			}
		}
		else{
			locationData=new JSONObject(geocode).getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").toString();
		}
		return locationData;
	}
}
