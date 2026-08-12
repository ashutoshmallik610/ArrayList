package com.customer;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		CustomerDetails customerDetails = new CustomerDetails();
		
		ArrayList<Customer> customers = customerDetails.getCustomerDetails();
		
//		customers.add(1, new Customer("kfdfgh", "jhgfdfgh", "87654567"));
		
		for(Customer c : customers)
		{
			if(c.getCustName().startsWith("A"))
			{
				c.display();
			}
		}
		
	}

}
