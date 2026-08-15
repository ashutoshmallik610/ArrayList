package com.swap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List; 
 
class Temp { 
    @SuppressWarnings("rawtypes")
	public static void print(Collection obj) 	// since Collection is a parent class, it can 
    { 												//accept any of its child class as parameter. 											
        System.out.print("Collection is: ");  
        for (Object a : obj) 
        { 
            System.out.print(a + " "); 
        } 
        System.out.println(); 
    } 
}

public class Swap { 
    public static void swap(List<String> list, int indx1, int indx2) { 
        String temp1 = list.get(indx1); 
        String temp2 = list.get(indx2); 
        list.set(indx1, temp2); 
        list.set(indx2, temp1); 
        System.out.print("After "); 
        Temp.print(list); 
    } 
 
    public static void main(String[] args) { 
        List<String> list = new ArrayList<>(); 
        list.add("one"); 
        list.add("Two"); 
        list.add("Three"); 
        System.out.print("Before "); 
        Temp.print(list); 
        swap(list, 0, 2); 
    } 
} 