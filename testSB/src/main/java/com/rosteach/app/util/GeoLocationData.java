package com.rosteach.app.util;

public class GeoLocationData {
	private String data;
	private String mediaType;
	
	public GeoLocationData(){}

	public GeoLocationData(String data, String mediaType) {
		super();
		this.data = data;
		this.mediaType = mediaType;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	
}
