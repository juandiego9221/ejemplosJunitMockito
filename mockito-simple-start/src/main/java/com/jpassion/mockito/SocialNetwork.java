package com.jpassion.mockito;

public class SocialNetwork {
	
	private String socialNetworkName="Facebook";
	
	public String getSocialNetworkName() {
		return socialNetworkName;
	}
	
	public String retrieveSocialNetworkInfo(){
		return getSocialNetworkName();
	}

}
