package com.allmethod.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample 
{
    public static void main(String[] args) {
        // 1. Initialization
        ArrayList<String> fruits = new ArrayList<>();

        // 2. add(E e) - Appends elements to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After add: " + fruits); // [Apple, Banana, Mango]

        // 3. add(int index, E element) - Inserts at a specific position
        fruits.add(1, "Orange");
        System.out.println("After inserting Orange at index 1: " + fruits); // [Apple, Orange, Banana, Mango]

        // 4. addAll(Collection c) - Adds multiple elements at once
        fruits.addAll(Arrays.asList("Grapes", "Pineapple", "Banana"));
        System.out.println("After addAll: " + fruits); 

        // 5. get(int index) - Retrieves an element
        String favorite = fruits.get(2);
        System.out.println("Element at index 2: " + favorite); // Banana

        // 6. set(int index, E element) - Replaces an element
        fruits.set(0, "Strawberry");
        System.out.println("After set (replaced Apple with Strawberry): " + fruits);

        // 7. size() - Gets the total number of elements
        System.out.println("Current list size: " + fruits.size());

        // 8. contains(Object o) - Checks if an item exists
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Contains 'Mango'?: " + hasMango); // true

        // 9. indexOf(Object o) - Finds the first occurrence of an item
        int firstBanana = fruits.indexOf("Banana");
        System.out.println("First index of 'Banana': " + firstBanana);

        // 10. lastIndexOf(Object o) - Finds the last occurrence of an item
        int lastBanana = fruits.lastIndexOf("Banana");
        System.out.println("Last index of 'Banana': " + lastBanana);

        // 11. isEmpty() - Checks if the list is empty
        System.out.println("Is list empty?: " + fruits.isEmpty()); // false

        // 12.Removes element by position
        fruits.remove(1); // Removes "Orange"
        System.out.println("After removing index 1: " + fruits);

        // 13. remove() - Removes the first match of an object
        fruits.remove("Banana"); 
        System.out.println("After removing first 'Banana': " + fruits);

        // 14. toArray() - Converts the ArrayList to a standard array
        Object[] fruitArray = fruits.toArray();
        System.out.println("Converted to Array: " + Arrays.toString(fruitArray));

        // 15. clear() - Removes all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits); // []
        System.out.println("Is list empty now?: " + fruits.isEmpty()); // true
    }
}
