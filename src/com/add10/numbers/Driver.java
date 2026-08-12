package com.add10.numbers;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(50);
		num.add(40);
		num.add(30);
		num.add(20);
		num.add(10);
		
		num.add(0, 16);
		
		System.out.println(num);
		
//		for(int i = 0; i < num.size(); i++)
//		{
//			int numbers = num.get(i);
//			System.out.println(numbers);
//		}
		
		for(int n : num)
		{
			System.out.println(n);
		}
	}

}
