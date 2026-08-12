package com.city;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		ArrayList<City> cit = driver.getCity();
		
		for(City c : cit)
		{
			c.dislpay();
		}
		
	}
	
	public ArrayList<City> getCity()
	{
		ArrayList<City> cities = new ArrayList<City>();
		
		cities.add(new City("Odisha","Cuttack"));
		cities.add(new City("Karnatak","Bangalore"));
		cities.add(new City("Tamilnadu","Chennai"));
		cities.add(new City("Maharastra","Nagpur"));
		
		return cities;
	}

}
