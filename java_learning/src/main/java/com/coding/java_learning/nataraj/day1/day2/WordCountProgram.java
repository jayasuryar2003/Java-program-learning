package com.coding.java_learning.nataraj.day1.day2;

import java.util.HashMap;

// word count program
// input = "I am from Natraj. I am from chennai"
// output =  natraj = 1, chennai = 1, I =2 , form =2 , am =2
public class WordCountProgram {
    public static void main(String[] args) {
        String str  = "I am from Natraj. I am from chennai";
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            }
            else {
                map.put(words[i], 1);
            }
        }
        System.out.println(map);
    }
}
