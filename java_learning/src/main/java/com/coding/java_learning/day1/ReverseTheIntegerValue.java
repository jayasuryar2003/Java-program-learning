package com.coding.java_learning.day1;

// Reverse the integer value
// input = [1,2,3,4,5]
//output = [5,4,3,2,1]

public class ReverseTheIntegerValue {
    public static void main(String[] args) {
        int number = 12345;
        String[] str = String.valueOf(12345).split("");
        String reverseString = "";
        for (int i = str.length-1; i >=0  ; i--) {
            reverseString += str[i];
        }
        System.out.println(Integer.valueOf(reverseString));
    }
}
