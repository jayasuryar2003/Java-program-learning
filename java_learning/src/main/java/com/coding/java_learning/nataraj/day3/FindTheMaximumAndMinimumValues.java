package com.coding.java_learning.nataraj.day3;

// Find the maximum and minimum values in the array
//input = "1,76,2,55,44,77,33,976"
// output:
// max = 976
// min = 1

import java.util.Arrays;

// concepts:
// Array sorting using looping concept recommended for interview
// inbuilt sort fiunction not recommneded for interview
// Stream concept not recommended for interviews
public class FindTheMaximumAndMinimumValues {
    static void main() {
        int[] arr = {1,76,2,55,44,77,33,976};
        int maximum = arr[0];
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];

            }

        }
        System.out.println("Maximum number is "+maximum);
        System.out.println("Minimum number is "+minimum);
        streamfun(arr);

    }

    public static void  streamfun(int[] arr){
        int maximum = Arrays.stream(arr).max().getAsInt();
        int  minimum = Arrays.stream(arr).min().getAsInt();
        System.out.println("Maximum number is "+maximum);
        System.out.println("Minimum number is "+minimum);
    }
}

