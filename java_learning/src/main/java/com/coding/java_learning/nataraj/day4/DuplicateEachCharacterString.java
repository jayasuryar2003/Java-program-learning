package com.coding.java_learning.nataraj.day4;


// Most asked java programming interview questions => Create image for Duplicate Each Character in a String
//
//input=“I am Nataraj”
//
//output= “II aamm NNaattaarraajj”
public class DuplicateEachCharacterString {
    static void main() {
   String name = "I am Nataraj";
   String arr[] = name.split("");
   String val = "";
   for (int i = 0; i < arr.length; i++) {
       val += arr[i]+arr[i];
        }
        System.out.println(val);
    }
}
