package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Question: Remove duplicates from a list using distinct().
public class RemoveDuplicatesWithoutCollectors {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }

}
