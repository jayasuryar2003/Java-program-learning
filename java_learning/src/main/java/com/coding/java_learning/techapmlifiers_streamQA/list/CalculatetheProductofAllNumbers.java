package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

//44 Question: Calculate the product of all numbers in a list using reduce.
public class CalculatetheProductofAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       int product = numbers.stream().reduce(1, (x, y) -> x * y); //--> first value in reduce if you want add it is 0 and it is multiple it is 1.
        System.out.println(product);
    }
}
//my understaing in reduce (1,(a,b)-> a*b) first it will take 1*a rightYes, your understanding is exactly correct. --> this is wrong
// In the operation reduce(1, (a, b) -> a * b), the variable a is the accumulator (the running total) and b is the current element from the stream.


//        Step-by-Step FlowLet's assume your stream contains the numbers [2, 3, 4].First Element Execution:a takes the identity value 1.b takes the first stream element 2.The lambda computes 1 * 2,
//        yielding 2.Second Element Execution:a takes the previous result 2.
//        b takes the next stream element 3.The lambda computes 2 * 3, yielding 6.Third Element Execution:a takes the previous result 6.b takes the final stream element 4.