package com.jpassion.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

//@RunWith(MockitoJUnitRunner.class)  // Not needed because of MockitoAnnotations.initMocks(this); below
public class PersonTest {
	
	@Mock
	private Address address;
	
	@Mock
	private SocialNetwork socialNetwork;
	
	@InjectMocks
	private Person person;
	
	@Before
	public void setup() throws Exception {
		person = new Person();
		// The following needs to be called after Person class is created
		MockitoAnnotations.initMocks(this);
	}
	
	@Test public void 
	should_return_complete_person_info_including_address() throws Exception {
		when(address.retrieveAddressInfo()).thenReturn("Korea Seoul");
		when(socialNetwork.retrieveSocialNetworkInfo()).thenReturn("Facebook");
		assertThat(person.retrievePersonInfo(), is("Sang Shin Korea Seoul Facebook"));
		verify(address, times(1)).retrieveAddressInfo();
		verify(socialNetwork, times(1)).retrieveSocialNetworkInfo();

	}

}
