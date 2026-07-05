package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Flatten a List of Lists
public class FlattenaListofLists {
    static void main() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        listOfLists.stream().flatMap(list -> list.stream()).forEach(System.out::println);
    }
//
//    List<List<Integer>> listOfLists = Arrays.asList(
//            Arrays.asList(1, 2, 3),
//            Arrays.asList(4, 5),
//            Arrays.asList(6, 7, 8, 9)
//    );
//    List<Integer> flattenedList = listOfLists.stream()
//            .flatMap(List::stream)
//            .collect(Collectors.toList());
//System.out.println(flattenedList);




}
