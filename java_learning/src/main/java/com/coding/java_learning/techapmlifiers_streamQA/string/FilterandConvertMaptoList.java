package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 24 Question: Given a map, filter entries with values greater than 10 and collect keys into a list.
public class FilterandConvertMaptoList { //-> most imporatnt
    static void main() {
        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
        List<String> val = map.entrySet().stream()
                .filter(entry->entry.getValue()>10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(val);

    }
}
