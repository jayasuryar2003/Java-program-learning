package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group Strings by Length
public class GroupStringsbyLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer,List<String>> gruopBy = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(gruopBy);
    }
}
