package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//41 Question: Generate the first N numbers in the Fibonacci sequence.
public class GenerateFibonacciSequenceUsingStreams {
    static void main() {
        int n = 10;
        List<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(arr -> arr[0])
                .collect(Collectors.toList());
        System.out.println(fibonacci);
      //  Stream.iterate(...)This creates an infinite list. It starts with the seed new int[]{0, 1}.
        //  The formula arr -> new int[]{arr[1], arr[0] + arr[1]} calculates the next pair.
        //  It takes the second number, and puts it first.
        //  Then, it adds both numbers to make the new second number.Example pairs: {0, 1} \rightarrow {1, 1} \rightarrow {1, 2} \rightarrow {2, 3}..limit(n)
        //  This cuts the infinite stream into a short list. It keeps only the first \(n\) items..map(arr -> arr[0])
        //  The stream currently holds integer arrays (like {0, 1}).This step transforms the arrays into single numbers.
        //  It pulls the first number (arr[0]) out of each array..collect(Collectors.toList())This takes all the single numbers from the stream.
        //  It packs them into a neat Java List<Integer>.System.out.println(fibonacci)This prints the final list of numbers on your screen.

    }
}



        //Yes, Java Streams effectively process data backward from the end during the setup phase.
// This behavior happens because streams use deferred execution through a pull-based architecture.
// The Setup Phase (Backward)When you write a stream pipeline, nothing happens immediately.
// Instead, Java builds a chain of linked objects. Each operation links backward to the one before it:The .collect() method connects back to .map().The .map() method connects back
// to .limit().The .limit() method connects back to Stream.iterate().The Execution Phase (Forward)Once the terminal operation (.collect()) triggers the pipeline,
// it pulls elements through the chain one by one. The data then flows forward:Stream.iterate() generates an array.It passes it forward to .limit()..limit() passes it forward to
// .map()..map() passes it forward to .collect().Why This MattersBecause the terminal operation is in control, it can stop the whole process early.
// In your code, .limit(n) keeps count. Once it receives n items, it refuses to pull any more data. This is why the infinite loop never happens.
// Would you like to see how this pull-based behavior affects performance when using a .filter() operation, or should we look at a short-circuiting example like .findFirst()?