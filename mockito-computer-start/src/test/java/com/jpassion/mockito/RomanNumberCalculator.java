package com.jpassion.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class RomanNumberCalculator {
	
	private RomanCalculator roman;
	
	@Before
	public void setup() throws Exception {
		roman = new RomanCalculator();
		// The following needs to be called after Person class is created
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void should_return_I_when_number_is_one() throws Exception{
		assertThat(roman.transform(1), is("I"));

	}
	
	@Test
	public void should_return_II_when_number_is_two() {
		assertThat(roman.transform(2), is("II"));
	}
//	
	@Test
	public void should_return_II_when_number_is_three() {
		assertThat(roman.transform(3), is("III"));
	}
//	
	@Test
	public void should_return_II_when_number_is_four() {
		assertThat(roman.transform(4), is("IV"));
	}
//	
//	@Test
//	public void should_return_II_when_number_is_five() {
//		assertThat(roman.transform(5), is("V"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_six() {
//		assertThat(roman.transform(6), is("VI"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_seven() {
//		assertThat(roman.transform(7), is("VII"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_eight() {
//		assertThat(roman.transform(8), is("VIII"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_nine() {
//		assertThat(roman.transform(9), is("IX"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_ten() {
//		assertThat(roman.transform(10), is("X"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_eleven() {
//		assertThat(roman.transform(11), is("XI"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_twelve() {
//		assertThat(roman.transform(12), is("XII"));
//	}
//	
//	@Test
//	public void should_return_II_when_number_is_thriteen() {
//		assertThat(roman.transform(13), is("XIII"));
//	}
//	
	
	
	
	
	
	

}
