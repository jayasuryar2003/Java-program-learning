package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Question: Find the 3rd largest element in a list.
public class FindNthLargestElementinaList { // --> findfirst returns a optional
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
        int nthLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow();
        System.out.println(nthLargest);

    }
}
