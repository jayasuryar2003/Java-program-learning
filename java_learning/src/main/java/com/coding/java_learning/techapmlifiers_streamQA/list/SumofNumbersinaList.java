package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

//Sum of Numbers in a List
public class SumofNumbersinaList {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
