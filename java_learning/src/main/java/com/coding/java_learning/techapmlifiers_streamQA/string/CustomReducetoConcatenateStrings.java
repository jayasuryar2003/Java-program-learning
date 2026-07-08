package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 35 Question: Concatenate strings in reverse order using reduce.
public class CustomReducetoConcatenateStrings {
    static void main() {
        List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
        // one way
//        Collections.reverse(words);
//        String concatenatedStrings = words.stream()
//                .collect(Collectors.joining(" "));
//        System.out.println(concatenatedStrings);
        String reversedConcatenation = words.stream()
                .reduce((w1, w2) -> w2 + " " + w1)
                .orElse("");
        System.out.println(reversedConcatenation);
        // --> reduce return optional
        // Alternative: Positional reversal without sorting using stream reduction
// (w1, w2) -> w2 + " " + w1 takes the next word (w2) and prepends it to the accumulated string (w1)
// .orElse("") safely handles empty lists to prevent a NoSuchElementException
//        Visual Breakdown of How It WorksIf your list is ["Stream", "API", "is"]:Step 1: Starts with w1 = "Stream", w2 = "API".
//        Combines to: "API Stream"Step 2: w1 becomes "API Stream", w2 = "is". Combines to: "is API Stream"Would you like to see how this
//        reduction approach scales when handling large datasets, or do you want to explore how to make it null-safe?

    }




//    Yes, you are thinking of the overloaded version of reduce that takes an initial starting value, known as the Identity.When
//    using it with String concatenation, it looks like this:javaString result = words.stream()
//            .reduce("", (w1, w2) -> w2 + " " + w1);
//    Use code with caution.3 Key Differences to Save in Your CommentsNo .orElse("") Needed: Because you provided a fallback starting value (""),
//    the stream is guaranteed to return a string—even if the list is empty.The "Extra Space" Side Effect: Because the initial value is an empty string (""),
//    your first step evaluates to w2 + " " + "". This leaves an unintended trailing space at the very end of your final string.Performance Impact:
//    Combining strings inside a loop or reduction using + creates a brand new string object on every single step. This is slow for large collections.
//    Recommended Version for Clean StringsTo get the exact same behavior without the trailing space issue, use standard string
//    joining:java// Safest identity-based approach if you want to avoid reduction bugs
//    String result = words.stream()
//            .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//                Collections.reverse(list);
//                return String.join(" ", list);
//            }));
//    Use code with caution.Would you like to see how the identity parameter (0) works for mathematical calculations like summing up or multiplying integers?



//    Here is how to use reduce to find maximum and minimum values, along with why the identity rule is critical for parallel streams
//    .Finding Maximum & Minimum ValuesWhen finding a max or min, your identity must be the absolute limit of what is possible so it doesn't accidentally interfere with your actual data.1. Finding Maximum (Identity = Integer.MIN_VALUE)The identity must be the smallest possible integer. Any number in your list will automatically be larger than it, ensuring a correct comparison.javaList<Integer> numbers = Arrays.asList(5, 12, 3, 8);
//
//    // Starts at -2147483648
//    int max = numbers.stream()
//            .reduce(Integer.MIN_VALUE, (accumulator, current) -> Integer.max(accumulator, current));
//
//System.out.println(max); // Output: 12
//    Use code with caution.2. Finding Minimum (Identity = Integer.MAX_VALUE)The identity must be the largest possible integer. Any number in your list will automatically be smaller than it.javaList<Integer> numbers = Arrays.asList(5, 12, 3, 8);
//
//    // Starts at 2147483647
//    int min = numbers.stream()
//            .reduce(Integer.MAX_VALUE, Integer::min); // Clean syntax using method reference
//
//System.out.println(min); // Output: 3
//    Use code with caution.The Strict Identity Rule in Parallel StreamsWhen you use .parallelStream(), Java splits your list into multiple chunks, runs them simultaneously on different CPU cores, and uses the identity value for every single chunk.If your identity value is wrong, your math breaks entirely.The Golden Rule:The identity value must be a true neutral element. For any value x:identity + x must equal xidentity * x must equal xBreaking the Rule (Example)Look what happens if you try to use 10 as a starting base for a sum using a parallel stream:javaList<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//
//    // SEQUENTIAL STREAM (Works as you might expect)
//    int seqSum = numbers.stream().reduce(10, Integer::sum);
//// 10 + 1 + 2 + 3 + 4 = 20
//
//    // PARALLEL STREAM (Broken!)
//    int parallelSum = numbers.parallelStream().reduce(10, Integer::sum);
//    // Output could be: 50!
//    Use code with caution.Why did it output 50?Because Java split the list into 4 separate threads:Thread 1 calculates: 10 + 1 = 11Thread 2 calculates: 10 + 2 = 12Thread 3 calculates: 10 + 3 = 13Thread 4 calculates: 10 + 4 = 14Combined result: 11 + 12 + 13 + 14 = 50To add a base number like 10 safely, you must always use 0 as the identity inside the stream, and then add your base number after the stream finishes: int correctSum = 10 + numbers.parallelStream().reduce(0, Integer::sum);.Would you like to explore complex reductions where the input type differs from the output type (like counting characters in a stream of strings), or should we look at other stream terminal operations?
//
//

}
