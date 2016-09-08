package com.rosteach.app.service.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rosteach.app.entity.geocoder.GeoLocation;
import com.rosteach.app.util.RestTemplateURLUtil;
import org.json.JSONObject;
@Service
public class GoogleAPIServiceImpl implements GoogleAPIService{	
	@Value("${google.com.api.key}")
    private String apiKey;
	
	@Autowired(required=false)
	private RestTemplate restTemplate;
	
	@Override
	public GeoLocation getGeocodeInformation(String mediaType, String location) {
		/**
		 * get geocodeResult information as String value
		 */
		String geoCodeResult = restTemplate.getForObject(RestTemplateURLUtil.getGeocodeApiURL(mediaType,location, apiKey),String.class);
		/**
		 * get JSONObject location from parent geometry in results array
		 */
		JSONObject geolocation = new JSONObject(geoCodeResult).getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location");
		return new GeoLocation(geolocation.getDouble("lat"),geolocation.getDouble("lng"));
	}

}
