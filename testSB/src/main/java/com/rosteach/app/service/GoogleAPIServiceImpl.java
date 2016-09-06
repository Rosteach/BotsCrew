package com.rosteach.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rosteach.app.utils.RestTemplateURLUtils;
import com.rosteach.app.entity.geocode.GeocodeInformation;
@Service
public class GoogleAPIServiceImpl implements GoogleAPIService{	
	@Value("${google.com.api.key}")
    private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public GeocodeInformation getGeocodeInformation(String mediaType, String location) {
		 return restTemplate.getForObject(RestTemplateURLUtils.getRestEndPoint(mediaType,location, apiKey),GeocodeInformation.class);
	}

}
