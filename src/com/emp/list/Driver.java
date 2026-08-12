package com.emp.list;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		EmployeeDetails emps =  new EmployeeDetails();
		ArrayList<Employee> employees = emps.getDetails();
		
		int maxSalary = 0;
		
		for(Employee e : employees)
		{
			if(maxSalary < e.getSalary())
			{
				maxSalary = e.getSalary();
			}
			e.display();
		}
		System.out.println("Max Salary is : "+maxSalary);
	}

}
