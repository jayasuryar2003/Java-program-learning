package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 19: Question: Convert a list of strings into a map with the string as the key and its length as the value.
public class CollectMapfromList {
    static void main() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(word -> word, String::length));
        System.out.println(wordLengthMap);

    }
}
