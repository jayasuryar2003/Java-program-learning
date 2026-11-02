package com.coding.java_learning.nataraj.day6;

import java.util.*;

//Most asked java programming interview questions =>
//Grouping Anagram Strings in an Array Using Arrays.Sort() method
//
//input=>{“eat”,”tea”,”tan”,”ate”,”nat”,”bat”};
//
//output=>[[eat, tea, ate], [bat], [tan, nat]]
public class GroupingAnagramStringsArraysSort {
    public static void main(String[] args) {
        // Input array of strings to be grouped by anagrams
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // HashMap to store the sorted string key mapping to the list of anagrams
        Map<String, List<String>> map = new HashMap<>(); // Create a HashMap...

        // Iterate through each word in the input array
        for (String word : input) { // Iterate through each word in the input array

            // Convert the word into an array of individual characters
            char[] charArray = word.toCharArray(); // Convert the word into a character array

            // Sort the characters alphabetically.
            // e.g., both "eat" and "tea" become ['a', 'e', 't']
            Arrays.sort(charArray); // ['a','e','t'], ['a','e','t']...

            // Convert the sorted character array into a unique String key.
            // Note: Use 'String.valueOf(charArray)' or 'new String(charArray)' in standard Java.
            String key = Arrays.toString(charArray); // //"['a','e','t']"

            // If the map doesn't contain this sorted combination yet, create a new list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>()); // //"['a','e','t']" -> []
            }

            // Add the original word to the list corresponding to its sorted key
            map.get(key).add(word); // //"['a','e','t']", ["eat"]
        }

        // Finally, we create a new ArrayList from the values of the map and print it
        System.out.println(new ArrayList<>(map.values())); // Finally, we create a new...
    }
}
