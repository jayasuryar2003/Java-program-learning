package com.coding.java_learning.day1;

//      input = [12,90,5,0,32,0,0,99];
//      output = [12,9,5,32,99,0,0,0,0];
//
//      concept:
//    1.separate the zeros and non zeros wothout using for loop


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeparatingZerosWithFunc_Day1 {
    public static void main(String[] args) {
//        int [] array = {2,90,5,0,32,0,0,99}; --> this will result in giving address
        Integer [] array = {2,90,5,0,32,0,0,99};
        Arrays.sort(array);
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}

//The Arrays.asList() method creates a fixed-size list that is directly backed by the array you pass into it.Any changes you make to the list will modify the original array, and vice versa.⚠️
// The Trap with Primitives (Why your code failed)Arrays.asList() only works with Objects. It does not work with primitive types like int, double, or char.If you pass an Integer[]: It creates a List<Integer> where each number
// is an element.If you pass an int[]: Java treats the entire array as a single Object. It creates a List<int[]> with a size of 1, containing just the array wrapper.💡 Examples of How It Behaves1.
// Correct Usage (With Objects/Wrappers)javaString[] names = {"Alice", "Bob"};
//List<String> list = Arrays.asList(names);
//
//list.set(0, "Charlie");
//System.out.println(names[0]); // Prints "Charlie" (The original array changed!)
//Use code with caution.2. Incorrect Usage (With Primitives)javaint[] numbers = {1, 2, 3};
//List<int[]> list = Arrays.asList(numbers);
//
//System.out.println(list.size()); // Prints 1 (Not 3!)
//Use code with caution.
