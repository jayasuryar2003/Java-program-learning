package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//45 Question: Create a sliding window of size 3 for a list of integers.
public class SlidingWindowofNElements {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<List<Integer>> slidingWindows = IntStream.range(0, numbers.size() - 2)
                .mapToObj(i -> numbers.subList(i, i + 3))
                .collect(Collectors.toList());
        System.out.println(slidingWindows);

    }
}
