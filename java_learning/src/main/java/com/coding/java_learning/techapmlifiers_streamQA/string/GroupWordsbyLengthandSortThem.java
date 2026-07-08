package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//43 Question: Group words by their length and sort each group alphabetically.
public class GroupWordsbyLengthandSortThem {
    static void main() {
        List<String> words = Arrays.asList("java", "stream", "api", "example", "code", "test");
        Map<Integer, List<String>> groupedAndSorted = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().sorted().collect(Collectors.toList()) // --> based on our requirements we can use this  Collectors.collectingAndThen
                )));
        System.out.println(groupedAndSorted);

    }

}
