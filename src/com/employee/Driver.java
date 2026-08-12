package com.employee;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		ArrayList<Employee> employees = employeeDetails.getEmployeeDetails();
		
		for(Employee e : employees)
		{
			if(e.getSalary()>50000)
			{
				e.showDetails();
			}
		}
		

	}

}
