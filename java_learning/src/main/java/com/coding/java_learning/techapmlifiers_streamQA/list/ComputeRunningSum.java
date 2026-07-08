package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 40 Question: Compute the running sum of a list of integers.
public class ComputeRunningSum {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> runningSum = IntStream.range(0, numbers.size())
                .mapToObj(i -> numbers.subList(0, i + 1).stream().mapToInt(Integer::intValue).sum())
                .collect(Collectors.toList());
        System.out.println(runningSum);

    }
}
