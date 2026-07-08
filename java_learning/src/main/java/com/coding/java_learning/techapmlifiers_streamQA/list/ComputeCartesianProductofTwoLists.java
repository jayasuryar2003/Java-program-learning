package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 31 Question: Compute the Cartesian product of two lists of integers.
public class ComputeCartesianProductofTwoLists {
    static void main() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
            List<String> cartesianProduct = list1.stream()
                    .flatMap(i -> list2.stream().map(j -> "(" + i + "," + j + ")"))
                .collect(Collectors.toList());
        System.out.println(cartesianProduct); // Output: [(1,4), (1,5), (2,4), (2,5), (3,4), (3,5)]

        // cartesianProduct = list1.stream()
        //                    .flatMap(i -> list2.stream().map(j ->  this is one of the scenario I used to think that how to pass two collections
        // here we are using flatmap for multiple collection

    }
}
