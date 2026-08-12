package com.count.duplicate;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		InputNumbers input = new InputNumbers();
		
		ArrayList<Elements> elements = input.getElements();
		
		int count =0;
		int total = 0;
		
		for(Elements e : elements)
		{
			total = total + e.getNum();
			
			if(e.getNum() == 10)
			{
				count++;
			}
			
		}
		System.out.println("Sum of the numbers : "+total);
		System.out.println("10 is repeated "+count+" times.");
	}

}
