package com.rosteach.app.service.google;

import com.rosteach.app.entity.geocoder.GeoLocation;

public interface GoogleAPIService {
	public GeoLocation getGeocodeInformation(String mediaType,String location);
}
