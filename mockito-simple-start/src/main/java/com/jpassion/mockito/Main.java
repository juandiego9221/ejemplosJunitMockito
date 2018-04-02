package com.jpassion.mockito;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAddress(new Address());
		System.out.println(person.retrievePersonInfo());
	}

}
