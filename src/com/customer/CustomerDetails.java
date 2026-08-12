package com.customer;

import java.util.ArrayList;

public class CustomerDetails 
{
	public ArrayList<Customer> getCustomerDetails()
	{
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	list.add(new Customer("JHGFDSDF", "Rahul", "7654345687"));
	list.add(new Customer("UYTDFGHJ", "Sandeep", "7654345687"));
	list.add(new Customer("JHGFDSDF", "Suresh", "7654345687"));
	list.add(new Customer("YTERTYU", "Pikun", "7654345687"));
	list.add(new Customer("JHGFDSD", "Smruti", "7654345687"));
	list.add(new Customer("DFGHJKF", "Chinmay", "7654345687"));
	list.add(new Customer("PIUYTRF", "Abhijit", "7654345687"));
	list.add(new Customer("WERTYPO", "Babul", "7654345687"));
	list.add(new Customer("UYTRERT", "Akshya", "7654345687"));
	
	return list;
	
	}
	
	
}
