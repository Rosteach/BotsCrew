package com.rosteach.app.entity.geocoder;

import java.io.IOException;
import java.io.Serializable;

import org.json.simple.parser.ParseException;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.rosteach.app.manager.ObjectMapperManager;
import com.rosteach.app.response.pojo.GeocodeResponse;


@JacksonXmlRootElement(localName="location")
public class GeoLocation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JacksonXmlProperty(isAttribute=true)
	private double lat;
	@JacksonXmlProperty(isAttribute=true)
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
	public static GeoLocation getGeoLocation(String mediaType, String locationName) throws JsonParseException, JsonMappingException, IOException, RestClientException, ParseException {
		return ObjectMapperManager.getObjectMapper(mediaType).readValue(new GeocodeResponse().getGeoCodeData(mediaType, locationName), GeoLocation.class);
	}
}
