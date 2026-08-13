package com.lambda.print;

public class Elements {

	private int element;
	

	public Elements(int element) {
		super();
		this.element = element;
	}

	public int getElement() {
		return element;
	}
	public void display()
	{
		System.out.println(getElement());
	}
	
}
