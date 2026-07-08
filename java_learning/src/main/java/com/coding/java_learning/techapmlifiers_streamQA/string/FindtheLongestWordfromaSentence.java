package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.Comparator;

// 31 Question: Find the longest word in a sentence using Streams
public interface FindtheLongestWordfromaSentence {
    static void main() {
        String sentence = "Java Stream API is very powerful";
        String max = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(max);
        //  String max = Arrays.stream(sentence.split(" ")) --> this is very important line where we are making the arrays to stream
        // first check the array is primitive or object if it is primitive and  object use Arrays.stream()
        // important : don't forget that we have to pass arr inside the Arr Arrays.stream()
    }
}
