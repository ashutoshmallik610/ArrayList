package com.employee;

import java.util.ArrayList;

public class EmployeeDetails 
{
	public ArrayList<Employee> getEmployeeDetails()
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("JUYTRJHG", "Rahul", 60000));
		list.add(new Employee("JFGHJJJL", "Ram", 50000));
		list.add(new Employee("KJHGFGH", "Raman", 80000));
		list.add(new Employee("YTDFGH", "Abhi", 55000));
		list.add(new Employee("UTDFGHJ", "Sandeep", 40000));
		list.add(new Employee("JHGFDFGH", "Sangram", 45000));
		list.add(new Employee("UJYTDFGH", "Samita", 65000));
		list.add(new Employee("KJUFDFG", "Suman", 30000));
		
		return list;
		
	}
}
