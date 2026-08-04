package com.coding.java_learning.nataraj.day4;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.LinkedHashMap;
import java.util.Map;

//Most asked java programming interview questions => String Rearrangement Based on First Unique Pass and Remaining Characters.
//
//input:”aabbccdee”
//
//output:”abcdeabce”;
public class StringRearrangementFirstUniquPassRemainingCharacters {
    public static void main(String[] args) {
        String str = "aabbccdee";

        // LinkedHashMap preserves the insertion order of characters
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder name = new StringBuilder();  // To hold unique characters (abcde)
        StringBuilder store = new StringBuilder(); // To hold duplicates (abce)

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            name.append(entry.getKey()); // Every character goes here once

            if (entry.getValue() > 1) {
                store.append(entry.getKey()); // Only duplicates go here
            }
        }

        // Combine them together
        System.out.println(name.toString() + store.toString()); // Output: abcdeabce
    }
}
