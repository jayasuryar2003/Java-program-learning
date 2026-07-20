package com.coding.java_learning.nataraj.day1.day2;

import java.util.Arrays;
import java.util.LinkedList;

// Remove the target element from the array
// input = {1,2,3,4,5,6,6,7,4,5,9,10}  --?> you should not use
//Traget element = 6
//input = {1,2,3,4,5,7,4,5,9,10}
public class RemoveTheTargetElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6,7,4,5,9,10};
        int target = 6;
        LinkedList list = new LinkedList();

        for (int i : arr) {
            if (target == i) {
                continue;
            }
            list.add(i);

        }
//        System.out.println(list.toArray());//[Ljava.lang.Object;@776ec8df
        System.out.println(Arrays.toString(list.toArray()));
    }
}
