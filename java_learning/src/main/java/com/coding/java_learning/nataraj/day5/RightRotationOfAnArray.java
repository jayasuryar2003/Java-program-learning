package com.coding.java_learning.nataraj.day5;

//Most asked java programming interview questions => Right Rotate an Array by K
//Positions
//
//input=> {1,2,3,4,5} | Right_Rotate=> 2
//
//output=>{4,5,1,2,3}
public class RightRotationOfAnArray {
    static void main() {
        int[] input= {1,2,3,4,5};
        int rotate = 2;
        rotate = rotate%input.length;

        for (int r = 0; r < rotate; r++) {
            int last = input[input.length-1];
            for  (int i = input.length-1; i > 0; i--) {
                input[i]=input[i-1];
            }
            input[0]= last;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }

    }
}
