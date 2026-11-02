package com.coding.java_learning.nataraj.day6;

import java.util.*;
// Most asked java programming interview questions =>
//Grouping Anagram Strings in an Array
//
//input=>{“eat”,”tea”,”tan”,”ate”,”nat”,”bat”};
//
//output=>[[eat, tea, ate], [bat], [tan, nat]]
public class GroupingAnagramStringsArray {
    public static void main(String[] args) {
        // Input array of strings to be grouped by anagrams
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // HashMap to store the frequency key mapping to the list of anagrams
        Map<String, List<String>> map = new HashMap<>(); // Create a HashMap to store the groups of anagrams

        // Iterate through each word in the input array
        for (String word : input) {

            // Create a fixed size array of 26 to store character frequencies (for 'a' through 'z')
            // Initialized to all zeros: [0, 0, 0, ..., 0]
            int[] count = new int[26];

            // Convert the current word into a character array and loop through each character
            for (char c : word.toCharArray()) {
                // Increment the frequency of the current character.
                // Subtracting 'a' normalizes ASCII value so 'a' -> index 0, 'b' -> index 1, etc.
                count[c - 'a']++;
            }

            // Convert the integer frequency array into a unique string representation.
            // Example for "eat": "[1, 0, 0, 0, 1, 0, ..., 1, ...]"
            String key = Arrays.toString(count);

            // If this unique signature/key does not exist in our map yet,
            // initialize it with an empty ArrayList.
            map.putIfAbsent(key, new ArrayList<>());

            // Retrieve the list belonging to this signature key and add the current word to it
            map.get(key).add(word);
        }

        // Finally, we create a new ArrayList from the values of the map to return the grouped list
        List<List<String>> result = new ArrayList<>(map.values());

        // Print the grouped anagrams
        System.out.println(result);
        // Output: [[eat, tea, ate], [bat], [tan, nat]]
    }
}
