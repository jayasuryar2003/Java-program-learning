package com.coding.java_learning.nataraj.day2;

// input = "aaaabbcddeeeee"
// output = "a4b2c1d2e5"
public class StringCompression {
    static void main() {
        String str1 = "abbcddeeeee";
        char[] ch1 = str1.toCharArray();
        int count = 1;
        String value = "";
        for (int i = 0; i < str1.length(); i++) {
            if(str1.length() >i+1 && ch1[i] == ch1[i+1]){ // this condition is for to avoid array index out of exeception.
                count++;
            }
            else{
                value= value + ch1[i]+count;
                count=1;
            }
        }
        System.out.println(value);
    }
}
