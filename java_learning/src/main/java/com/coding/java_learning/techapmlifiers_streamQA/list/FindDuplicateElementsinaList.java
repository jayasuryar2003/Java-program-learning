package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsinaList {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> number = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(number);
    }


//    Set<Integer> unique = new HashSet<>();
//    Set<Integer> duplicates = numbers.stream()
//            .filter(n -> !unique.add(n)) // in set for duplicates elements add returns false
//            .collect(Collectors.toSet());
//System.out.println(duplicates);

}
