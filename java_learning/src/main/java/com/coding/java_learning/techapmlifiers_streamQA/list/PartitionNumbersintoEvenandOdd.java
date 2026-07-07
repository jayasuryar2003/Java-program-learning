package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question: Partition a list of numbers into even and odd.
public class PartitionNumbersintoEvenandOdd {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);// if it is separating two things in your mind it should come as partionBy
        Map<Boolean, List<Integer>> oddOrEven = numbers.stream() // --> the format should be boolean and list of elements don't forget it is list
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(oddOrEven);
        oddOrEven.get(true).forEach(System.out::println);
        oddOrEven.get(false).forEach(System.out::println);

    }
}
