package com.rosteach.app.entity.geocoder.pojo;

import org.wicketstuff.gmap.api.GLatLng;

/**
 * POJO for a google geocoder JSON Object viewport and bounds<br/>
 * Contains the recommended viewport for displaying the returned result, specified as two
 * latitude,longitude values defining the southwest and northeast corner of the viewport bounding
 * box. Generally the viewport is used to frame a result when displaying it to a user.
 * 
 * <p>
 * See also: <a href="https://developers.google.com/maps/documentation/geocoding/?hl=en#Results">
 * Google Geocoder JSONResult Doc</a><br/>
 * 
 * <b>Note:</b><br/>
 * The most documentation in this class a have been adopted by Google documentation.<br/>
 * Say thank you to Google!
 * </p>
 * 
 * @author Mathias Born - Contact: www.mathiasborn.de
 */
public class NortheastSoutwestInfo{

	private GLatLng northeast;
	private GLatLng southwest;

	/**
	 * @return the northeast
	 */
	public GLatLng getNortheast()
	{
		return northeast;
	}

	/**
	 * @param northeast
	 *            the northeast to set
	 */
	public void setNortheast(GLatLng northeast)
	{
		this.northeast = northeast;
	}

	/**
	 * @return the southwest
	 */
	public GLatLng getSouthwest()
	{
		return southwest;
	}

	/**
	 * @param southwest
	 *            the southwest to set
	 */
	public void setSouthwest(GLatLng southwest)
	{
		this.southwest = southwest;
	}

}
