package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 29 Question: Partition strings into palindromes and non-palindromes.
public class PartitionStringsbyPalindrome {// --> why we are gong by to partionby because we want to get two set of outputs
    static void main() {
        List<String> words = Arrays.asList("radar", "level", "java", "stream");
        Map<Boolean, List<String>> map = words.stream()
                .collect(Collectors.partitioningBy(word-> word.equals(new StringBuilder(word).reverse().toString())));
        System.out.println(map);

    }
}
