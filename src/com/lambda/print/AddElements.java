package com.lambda.print;

import java.util.ArrayList;

public class AddElements 
{
	public ArrayList<Elements> getElements()
	{
		ArrayList<Elements> list = new ArrayList<Elements>();
		
		list.add(new Elements(10));
		list.add(new Elements(20));
		list.add(new Elements(30));
		list.add(new Elements(40));
		list.add(new Elements(50));
		list.add(new Elements(10));
		list.add(new Elements(21));
		list.add(new Elements(30));
		list.add(new Elements(40));
		list.add(new Elements(50));
		
		return list;
	}
	
	public void printElements(ArrayList<Elements> integers)
	{
		integers.forEach(i -> {
			
			if(i.getElement() % 2 == 0)
			{
				System.out.println(i.getElement());
			}
			
		});
	}
}
