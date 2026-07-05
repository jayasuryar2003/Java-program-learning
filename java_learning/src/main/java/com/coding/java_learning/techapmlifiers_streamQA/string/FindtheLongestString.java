package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindtheLongestString {
    static void main() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
        Optional<String> longestWord = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1)
                .findFirst(); // Extracts the first element out of the limited stream --> findfirst return optional

        // Print the result if present, otherwise print an empty string
        System.out.println(longestWord.orElse(""));// Output:

        // method 2
//        Optional<String> longestWord = words.stream()
//                .max(Comparator.comparingInt(String::length));
//
//        System.out.println(longestWord.orElse(""));

        //method 3
//        String longest = words.stream()
//                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
//                .orElse(null);
//        System.out.println(longest);

    }
}
