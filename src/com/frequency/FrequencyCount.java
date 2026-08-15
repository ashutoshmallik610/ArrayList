package com.frequency;

import java.util.Collection; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
 
class Temp { 
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

public class FrequencyCount { 
    public static void main(String[] args) { 
        List<Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(2); 
        Temp.print(list); 
        System.out.println("Frequency of 2: " + Collections.frequency(list, 2)); 
    } 
}