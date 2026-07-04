package com.coding.java_learning.day1;

import java.util.ArrayList;
import java.util.List;

public class SeparatingZeros_day1 {
//      input = [12,90,5,0,32,0,0,99];
//      output = [12,9,5,32,99,0,0,0,0];
//
//      concept:
//    1.separate the zeros and non zeros
//    2.add the non zeros values in list and add the zero value in list
public static void main(String[] args) {
    int[] array = {12,90,5,0,32,0,0,99};
    String zero = "";
    List<Integer> list = new ArrayList<>();
//    List<Integer> list1 = new ArrayList<>();
    for (int arr:array){
        if(arr == 0){
            zero  +=String.valueOf(arr);

//            list1.add(arr);
        }
        else{
            list.add(arr);
        }
    }
//    list.addAll(list1);
    for (int i = 0; i < zero.length(); i++) {
        list.add(Integer.parseInt(zero.split("")[i]));//            The return type of the String.split() method in Java is a String[] (an array of String objects).
    }
    System.out.println(list);
}
}


//When you pass a primitive int to String.valueOf(), Java uses method overloading to automatically select a version of the method specifically designed for the primitive int type.No wrapper object (Integer) is created or needed for this
// process.🌟 How It Works Behind the ScenesJava's String class has multiple versions of the valueOf() method. When the compiler looks at your code, it matches your primitive int directly to the primitive method signature:javapublic
// static String valueOf(int i) {
//        return Integer.toString(i);
//}
//Use code with caution.⚙️ The Execution StepsDirect Method Matching: The compiler sees a primitive int and routes it to String.valueOf(int i).Static Delegation:
// This method directly calls the static method Integer.toString(i).Character Array Allocation: Inside Integer.toString(), Java calculates the number of digits, allocates a basic char[] (or byte[] in modern Java),
// fills it with the digits, and packages it into a String object.

