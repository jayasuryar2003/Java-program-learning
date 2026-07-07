package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Question: Find common elements between two lists.
public class FindCommonElementsBetweenTwoLists {
    static void main() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> list3 = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(list3);
    }



}
