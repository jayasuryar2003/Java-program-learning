package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;

//Convert List of Strings to Uppercase
public class ConvertListofStringsToUppercase {
    static void main() {
        List<String> names = Arrays.asList("java", "stream", "api");
        names.stream()
                .map((String::toUpperCase))
                .forEach(System.out::println);
    }
}
