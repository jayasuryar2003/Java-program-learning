package com.coding.java_learning.nataraj.day1.day2;

import java.util.Arrays;
import java.util.HashSet;

// intput: "abcd"
// output: true
// intput: "abAcd"
// output: False
// A string should contains only unique values
public class StringContainsUniqueValue {
    static void main() {
        String str1 = "abcd".toLowerCase();
        String[] arr =  str1.split("");
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        if (str1.length() != set.size()) {
            System.out.println(false);
        }
            else {
            System.out.println(true);
        }
    }
}
