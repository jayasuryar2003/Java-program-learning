package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Filter Even Numbers from a List
public class Filter_Even_Numbers {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list1 = list.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());//.toList();
        System.out.println(list1);
    }

}
