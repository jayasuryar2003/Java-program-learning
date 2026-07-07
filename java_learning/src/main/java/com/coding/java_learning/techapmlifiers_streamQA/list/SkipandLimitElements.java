package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

// 30 Question: Skip the first 3 elements and limit the result to the next 2.
public class SkipandLimitElements {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers2 = numbers.stream()
                .skip(3)
                .limit(2)
                .toList();
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
