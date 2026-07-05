package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.List;

//Check if Any String Matches a Condition
public class CheckifAnyStringMatchesaCondition {
    static void main() {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean containsAPI = strings.stream()
                .anyMatch(s -> s.contains("API"));// anymatch returns boolean
        System.out.println(containsAPI);

    }
}
