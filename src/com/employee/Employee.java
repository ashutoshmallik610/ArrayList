package com.employee;

public class Employee 
{
	private String empid;
	private String name;
	private int salary;
	
	public Employee(String empid, String name, int salary) 
	{
		this.empid = empid;
		this.name = name;
		setSalary(salary);
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) 
	{	
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid saraly");
			this.salary=0;
		}
	}

	public void showDetails()
	{
		System.out.println("-----------------");
		System.out.println("Id : "+getEmpid());
		System.out.println("Name : "+getName());
		System.out.println("Salary : "+getSalary());
	}
	
}
