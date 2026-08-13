package com.coding.java_learning.nataraj.day5;

//Most asked java programming interview questions => Numerical palindrome pyramid pattern
//
//input => 4
//
//output =>
//        1
//        121
//        12321
//        1234321
public class PalindromePyramidPattern {
    static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {              //row maker

            // Print spaces to center the pyramid
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");              //i=1=> 3space, i=2=>2space
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);                //i=1=>1, i=2=>12, i=3=>123
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);                //i=1=>no, i=2=>1, i=3=>21
            }

            //   1
            //  121
            // 12321
            //1234321

            System.out.println();
        }
    }

}
