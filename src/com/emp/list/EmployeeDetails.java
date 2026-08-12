package com.emp.list;

import java.util.ArrayList;

public class EmployeeDetails 
{
	public ArrayList<Employee> getDetails()
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("DFGHHJ","Rahul",50000));
		list.add(new Employee("JFGHVGG","Sandeep",60000));
		list.add(new Employee("JFGHVGG","Pikun",40000));
		list.add(new Employee("JFGHVGG","Deep",30000));
		list.add(new Employee("JFGHVGG","soumya",70000));
		
		return list; 
	}
}
