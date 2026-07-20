package com.coding.java_learning.nataraj.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupicateElemntsFromTheString {
    public static void main(String[] args) {
        String str = "banana";
        String[] strArray = str.toLowerCase().split("");//["b","a","n","a","n","a"]
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(strArray));//[b,a,n,a,n,a]
        str = String.join("",set);
        System.out.println(str);

    }
}
