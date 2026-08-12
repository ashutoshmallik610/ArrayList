package com.sample.employee;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		//i want to store String object(Employee names)
			
		//1. Create a collection object(creating container which will store the employee name)
		ArrayList<String> employeeNames = new ArrayList<String>();
		
		//2. Add elements(Employee names)
		employeeNames.add("Rahul");
		employeeNames.add("Hemant");
		employeeNames.add("Sachin");
		employeeNames.add("Daksh");
		employeeNames.add("Sachin");
		employeeNames.add("Sachin");
		
		//print it
		System.out.println(employeeNames);
		
		System.out.println();
		//Using for loop
		for(int i = 0; i < employeeNames.size(); i++)
		{
			String name = employeeNames.get(i);
			System.out.println(name);
		}
		System.out.println();
		//using for each loop
		for(String name : employeeNames)
		{
			System.out.println(name);
		}
	}

}
