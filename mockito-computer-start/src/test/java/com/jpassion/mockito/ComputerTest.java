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


public class ComputerTest {
	
	@Mock
	private Adder adder;

	@InjectMocks
	private Computer computer;
	
	@Before
	public void setup() throws Exception{
		computer = new Computer();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void should_return_operation_add() throws Exception{
		when(adder.add(2,2)).thenReturn(4);
		assertThat(computer.computeSquareAfterAddition(2,2), is(16));
		verify(adder, times(2)).add(2,2);
	}
	

}
