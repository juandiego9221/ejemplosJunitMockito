package com.jpassion.mockito;

public class Address {
	
	private String city = "Boston";
	private String country = "U.S.A.";
	
	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
	
	public String retrieveAddressInfo(){
		return getCountry() + " " + getCity();
//		return "cadena";
	}
}
