package com.employee.name;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		EmployeeNames emp = new EmployeeNames();
		
		ArrayList<Employee> employees = emp.getEmployeeNames();
		
		System.out.println("========Employees========");
		for(Employee e : employees)
		{
			e.display();
		}
		if(!employees.isEmpty())
		{
			Employee firstEmployee = employees.get(0);
			System.out.print("First Employee : ");
			firstEmployee.display();
		}
		else
		{
			System.out.println("The employee list is empty");
		}
		if(!employees.isEmpty())
		{
			Employee lastEmployee = employees.get(employees.size()-1);
			System.out.print("Last Employee : ");
			lastEmployee.display();
		}
		else
		{
			System.out.println("The employee list is empty");
		}
		
		System.out.println("The total number of employees : "+employees.size());
	}

}
