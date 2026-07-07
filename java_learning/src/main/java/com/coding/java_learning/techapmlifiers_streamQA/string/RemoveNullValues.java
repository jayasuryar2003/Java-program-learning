package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Question: Remove null values from a list using filter.
public class RemoveNullValues {
    static void main() {
        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        words.stream()
                .filter(Objects::nonNull) // this objects is A utility toolkit full of helper methods and it is different from object class
                .forEach(System.out::println);
    }
}
