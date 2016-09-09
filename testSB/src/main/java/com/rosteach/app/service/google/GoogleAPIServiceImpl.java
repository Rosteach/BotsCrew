package com.rosteach.app.service.google;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rosteach.app.entity.geocoder.GeoLocation;
import com.rosteach.app.request.pojo.GeolocationRequest;

@Service
public class GoogleAPIServiceImpl implements GoogleAPIService{	
	@Override
	public GeoLocation getGeoLocation(GeolocationRequest request) throws JsonParseException, JsonMappingException, IOException, RestClientException, ParseException {
		return GeoLocation.getGeoLocation(request.getMediaType(),request.getLocationName());
	}
}
