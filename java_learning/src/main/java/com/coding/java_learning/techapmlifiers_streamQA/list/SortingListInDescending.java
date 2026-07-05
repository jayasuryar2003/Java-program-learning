package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListInDescending {
    static void main() {
        List<Integer> list1 = Arrays.asList(3, 5, 1, 4, 2);
//        list1.stream()
////                .sorted(Comparator.reverseOrder());
//                .sorted(Comparator.comparing(Integer::intValue).reversed())
//                .forEach(System.out::println);
//
//    }
        List<Integer> sortedNumbers = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }

    }
