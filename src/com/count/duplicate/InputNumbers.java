package com.count.duplicate;

import java.util.ArrayList;

public class InputNumbers {

	public ArrayList<Elements> getElements()
	{
		ArrayList<Elements> list = new ArrayList<Elements>();
		
		list.add(new Elements(10));
		list.add(new Elements(20));
		list.add(new Elements(10));
		list.add(new Elements(30));
		list.add(new Elements(10));
		list.add(new Elements(20));
		list.add(new Elements(40));
		
		return list;
	}
}
