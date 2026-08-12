package com.emp.list;

public class Employee
{
	private String id;
	private String name;
	private int salary;
	
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	public void display()
	{
		System.out.println("ID : "+getId()+"Name : "+getName()+"Salary : "+getSalary());
	}
	
}
