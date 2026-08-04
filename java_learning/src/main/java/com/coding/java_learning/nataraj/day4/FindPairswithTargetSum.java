package com.coding.java_learning.nataraj.day4;

import java.util.ArrayList;
import java.util.List;

//Most asked java programming interview questions => Find Pairs with Target Sum
//
//input={8,1,6,4,3,7,9,8,2,5,0,10} ,Targeted_Sum=7
//
//output=>[[1,6], [4,3], [7,0], [2,5]]
public class FindPairswithTargetSum {
    static void main() {
        int[] arr = {8,1,6,4,3,7,9,8,2,5,0,10};
        int target = 7;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target -  arr[i] == arr[j]) {
                    String str = "["+arr[i]+","+arr[j]+"]";
                    list.add(str);
                }
            }

        }
        System.out.println(list);
    }
}
