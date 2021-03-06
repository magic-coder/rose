package com.rose.mps.service;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated
 * source version: 2.1
 * 
 */
public class Hotel extends Service {
	private String password;
	
	private String username;
	
	public Hotel(URL wsdlLocation, String username, String password){
		super(wsdlLocation, new QName("http://tempuri.org/", "Hotel"));
		this.password = password;
		this.username = username;
	}

	public Hotel(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	@WebEndpoint(name = "ws")
	public IHotelService getWs() {
		IHotelService hotelService = super.getPort(new QName("http://tempuri.org/", "ws"), IHotelService.class);
		((BindingProvider) hotelService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
		((BindingProvider) hotelService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		
		return hotelService;
	}

}
