package com.coding.java_learning.nataraj.day1.day2;

// input = "a4b2c1d2e5"
// output = "aaaabbcddeeeee"
public class StringDecompression {
    static void main() {

        String str1 = "a4b2c1d2e5";
        String concat = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (Character.isDigit(ch)) {
                for (int j = 0; j < Integer.parseInt(String.valueOf(str1.charAt(i))); j++) {
                    concat = concat + str1.charAt(i-1);
                }
            }
        }
        System.out.println(concat);
    }
}
