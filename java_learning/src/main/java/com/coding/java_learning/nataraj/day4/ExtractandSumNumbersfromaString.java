package com.coding.java_learning.nataraj.day4;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.TreeMap;

//Day 14: Most asked java programming interview questions => Extract and Sum Numbers from a String

//input:”data#2000–334::3”;
//
//output:2337;
public class ExtractandSumNumbersfromaString {
    public static void main(String[] args) {
        String str = "data#2000–334::3";
        String temp = "0"; // Base value to handle consecutive non-digits safely
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch; // Build the multi-digit number
            } else {
                sum += Integer.parseInt(temp);
                temp = "0"; // Reset back to baseline
            }
        }
        // Add the final remaining number at the end of the string
        sum += Integer.parseInt(temp);

        System.out.println(sum); // Output: 2337
    }
}

