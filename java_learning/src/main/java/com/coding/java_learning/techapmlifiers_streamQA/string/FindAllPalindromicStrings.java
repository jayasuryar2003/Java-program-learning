package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question: Find all strings that are palindromes in a list.
public class FindAllPalindromicStrings {
    static void main() {
        List<String> words = Arrays.asList("radar", "level", "world", "java");
        List<String> palindromes = words.stream()
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes);

    }
}
