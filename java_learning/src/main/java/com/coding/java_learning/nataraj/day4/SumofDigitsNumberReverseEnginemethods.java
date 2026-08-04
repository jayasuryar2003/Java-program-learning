package com.coding.java_learning.nataraj.day4;


// Most asked java programming interview questions => Sum of Digits of a Number using Reverse Engine methods
//
//input=>12345
//
//output=>15
public class SumofDigitsNumberReverseEnginemethods {
    static void main() {
        int number = 12345;
        int sum  =0;
        while(number!=0)
        {
            sum+=number%10;
            number/=10;

        }
        System.out.println(sum);
        stringMethod();
    }

    static void stringMethod(){
        int number = 12345;
        int sum  =0;
        String countString = String.valueOf(number);
        for (int i = 0; i < countString.length(); i++) {
            sum+=Integer.parseInt(countString.charAt(i)+"");
        }
        System.out.println(sum);
    }
}
