package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//23 Question: Reverse each string in a list.
public class ReverseEachStringinaList {
    static void main() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        List<String> reversedWord = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString()) //--> focus here mostly
                .collect(Collectors.toList());
        System.out.println(reversedWord);
    }

}
