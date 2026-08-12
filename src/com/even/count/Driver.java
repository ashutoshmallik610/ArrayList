package com.even.count;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		EvenCount evenCount = new EvenCount();
		
		ArrayList<Integer> numbers = evenCount.getElements();
		
		int count = 0;
		
		for(int i = 0; i < numbers.size(); i++)
		{
			if(numbers.get(i) % 2 == 0)
			{
				System.out.println(numbers.get(i));
				count ++;
			}
			
		}
		System.out.println("The number of even numbers is : "+count);

	}

}
