package com.rosteach.app.entity.geocode;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
//import com.rosteach.app.entity.geocode.pojo.GeoCode;
import com.rosteach.app.manager.ObjectMapperManager;
//import com.rosteach.app.util.GeocodeResponse;

public class GeoLocation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private double lat;
	private double lng;
	
	public GeoLocation(){}
	public GeoLocation(double lat, double lng){
		this.lat=lat;
		this.lng=lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public GeoLocation getGeoLocation(String mediaType,String locationName) throws JsonParseException, JsonMappingException, IOException{
		InputStream inputStream = this.getClass().getResourceAsStream("");
		return ObjectMapperManager.getObjectMapper(mediaType).readValue(inputStream, GeoLocation.class) ;
	}
}
