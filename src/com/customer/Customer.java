package com.customer;

public class Customer 
{
	private String custId;
	private String custName;
	private String phone;
	
	public Customer(String custId, String custName, String phone) 
	{
		setCustId(custId);
		this.custName = custName;
		setPhone(phone);
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) 
	{	
		if(custId==null || custId.isEmpty())
		{
			System.out.println("Invalid Customer Id");
			this.custId=null;
		}
		else
		{
			this.custId = custId;
		}
		
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) 
	{	
		if(phone==null || phone.isEmpty())
		{
			System.out.println("Invalid phone");
			this.phone=null;
		}
		else
		{
		this.phone = phone;
		}
	}
	
	public void display()
	{
		System.out.println("Customer Id : "+getCustId());
		System.out.println("Customer Name : "+getCustName());
		System.out.println("Phone number : "+getPhone());
	}
	
}
