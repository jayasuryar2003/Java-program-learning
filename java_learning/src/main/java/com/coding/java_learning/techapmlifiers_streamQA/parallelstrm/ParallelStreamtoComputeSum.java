package com.coding.java_learning.techapmlifiers_streamQA.parallelstrm;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamtoComputeSum {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }



}
