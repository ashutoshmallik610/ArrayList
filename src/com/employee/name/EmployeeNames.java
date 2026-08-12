package com.employee.name;

import java.util.ArrayList;

public class EmployeeNames 
{
	public ArrayList<Employee> getEmployeeNames()
	{
		ArrayList<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee("Abhijit"));
		emps.add(new Employee("Rakesh"));
		emps.add(new Employee("Chinmay"));
		emps.add(new Employee("Soumya"));
		emps.add(new Employee("Shakti"));
		emps.add(new Employee("Lalatendu"));
		emps.add(new Employee("Vikash"));
		emps.add(new Employee("Dipankar"));
		
		return emps;
	}
}
