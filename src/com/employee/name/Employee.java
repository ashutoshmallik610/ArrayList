package com.employee.name;

public class Employee 
{
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void display()
	{
		System.out.println(getName());
	}
}
