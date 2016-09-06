package com.rosteach.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rosteach.app.utils.RestTemplateURLUtils;

@Service
public class GoogleAPIServiceImpl implements GoogleAPIService{	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getGeocodeResponse() {
		String json = restTemplate.getForObject(RestTemplateURLUtils.getRestEndPoint("json", "Bali", "AIzaSyBu5crncAYrbR9LTyEtLFtzRB2viEIgMdA"),String.class);
		System.out.println(json);
		return json;
	}

}
