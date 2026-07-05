package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;

// Count Strings with Specific Prefix
//Question: Count strings starting with a specific prefix, e.g., “A”.
public class CountStringswithSpecificPrefix {
    static void main() {
             List<String> list = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        list.stream()
                .filter(x -> x.startsWith("A"))
                .count();
    }
}
