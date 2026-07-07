package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

public class FindtheSumofSquaresofEvenNumbers {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int squareSum = numbers.stream()
                .filter(n-> n%2 == 0)
                .mapToInt(n-> n*n)
                .sum();
        System.out.println(squareSum); // .mapToInt(n-> n*n) --> in this line we are not only forming integer transformation we are also adding custom logic inside
    }
}
