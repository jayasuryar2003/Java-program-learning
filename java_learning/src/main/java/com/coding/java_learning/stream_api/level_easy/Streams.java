package com.coding.java_learning.stream_api.level_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    static void main() {
        // How do u create streams in java?
        // 1. list --> streams
        List<String> list = Arrays.asList("a","b","c");//--> asList basically returns a ArrayList output
        Stream<String> stream = list.stream();
        // 2. Arrays --> stream
        String[] arr= new String[]{"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);
        // 3. numbers --> stream .of()
        Stream<Number> stream2 = Stream.of(12,13,14,15);
        // using generate method
        Stream<Double> stream3 = Stream.generate(Math::random).limit(10); //--> this gives a supplier
    }
}
