package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateCustomCollector {
    static void main() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        String words1 =  words.stream()
                 .collect(Collectors.joining(","));
        System.out.println(words1);
    }
}
