package com.rosteach.app.service;

import com.rosteach.app.entity.geocode.GeocodeInformation;

public interface GoogleAPIService {
	public GeocodeInformation getGeocodeInformation(String mediaType,String location);
}
