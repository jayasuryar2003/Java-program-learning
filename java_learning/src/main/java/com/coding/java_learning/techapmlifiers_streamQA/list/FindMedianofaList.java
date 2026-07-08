package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//36 Question: Find the median of a list of integers.
public class FindMedianofaList {
    static void main() {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);
        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        double median = (sorted.size() % 2 == 0)
                ? (sorted.get(sorted.size() / 2 - 1) + sorted.get(sorted.size() / 2)) / 2.0
                : sorted.get(sorted.size() / 2);
        System.out.println(median);
    }


}
