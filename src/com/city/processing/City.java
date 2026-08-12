package com.city.processing;

public class City 
{
	private String city;

	public City(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}
	
	public void display()
	{
		System.out.println(getCity());
	}
	@Override
	public String toString() {
		return  city ;
	}
	
}
