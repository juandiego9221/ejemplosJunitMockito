package com.jpassion.mockito;

public class Person {
	
	private String name = "Sang Shin";
	private int age = 77;
 
	// Address is a dependency to Person 
	private Address address;
	
	private SocialNetwork  socialNetwork;

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String retrievePersonInfo(){
		return getName() + " " + address.retrieveAddressInfo() + " " + socialNetwork.retrieveSocialNetworkInfo();
	}

}
