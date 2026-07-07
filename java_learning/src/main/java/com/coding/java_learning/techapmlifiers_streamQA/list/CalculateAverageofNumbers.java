package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

//18 Question: Calculate the average of a list of integers.
public class CalculateAverageofNumbers {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double avergae = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(avergae);
    }
}
// average returns a optional double