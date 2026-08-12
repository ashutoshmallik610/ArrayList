package com.city.processing;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        CityProcessing cityProcessing = new CityProcessing();

        ArrayList<City> cities = cityProcessing.getCities();

        for (City c : cities) 
        {
            if (c.getCity() != null &&
                    (c.getCity().startsWith("m")
                    || c.getCity().startsWith("M"))) 
            {

                c.display();
            }
        }

        for(int i = 0; i < cities.size(); i++)
        {
        	for(int j = i+1; j < cities.size(); j++)
        	{
        		 if (cities.get(i).getCity().equals(cities.get(j).getCity()))
        		{
        			System.out.println("Duplicate : " + cities.get(i).getCity());
        		}
        	}
        }
        
        System.out.println("City size is : " + cities.size());

        System.out.println("City at index 5 is : " + cities.get(5));

        System.out.print("\nRemoving city from index 2 : ");
        cities.remove(2);
        System.out.println(cities);

        System.out.print("\nAdding a new city in index 3 : ");
        cities.add(3, new City("Mumbai"));
        System.out.println(cities);
        
    	}
    
    }