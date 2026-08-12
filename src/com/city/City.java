package com.city;

public class City 
{
	String state;
	String city;
	
	public City(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	
	public void dislpay()
	{
		System.out.println("State : "+state + "City : "+city);
	}
}
