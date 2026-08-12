package com.max.min;

import java.util.ArrayList;

public class MinMaxFind {
	
	public void findMax()
	{
		IputElements inputs = new IputElements();
		
		ArrayList<Integer> numbers = inputs.getElements();
		
		int max = 0;
		
		for(int i = 0; i < numbers.size(); i++)
		{
			if(numbers.get(i) > max)
			{
				max = numbers.get(i);
			}
		}
		
		System.out.println("Maximum element in the list is : "+max);
	}
	
	public void findMin()
	{
		IputElements inputs = new IputElements();
		
		ArrayList<Integer> numbers = inputs.getElements();
		
		int min = numbers.get(0);
		
		for(int i = 0; i < numbers.size(); i++)
		{
			
			if(numbers.get(i) < min)
			{
				min = numbers.get(i);
			}
			
		}
		System.out.println("Minimun element in the list is : "+min);
	}
}
