package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Concatenate Strings
public class ConcatenateStrings {
    static void main() {
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
        String result = words.stream()
                .collect(Collectors.joining(" "));

        System.out.println(result); // Output: "Java Streams are awesome"

//        String concatenated = words.stream()
//                .reduce("", (s1, s2) -> s1 + " " + s2).trim();
//        System.out.println(concatenated)

    }
}
