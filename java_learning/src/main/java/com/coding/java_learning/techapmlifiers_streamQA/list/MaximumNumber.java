package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumber {
    static void main() {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        int maximum = list1.stream()
//                .max(Integer::compare).get();
//                .max((a, b) -> Integer.compare(a, b)).get();
        .max(Comparator.naturalOrder()).get();
        // this three ways we can follow remeber it wwill always return a optional

        System.out.println(maximum);
    }
}
