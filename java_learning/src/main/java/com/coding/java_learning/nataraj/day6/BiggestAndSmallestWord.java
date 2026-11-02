package com.coding.java_learning.nataraj.day6;
//
//Most asked java programming interview questions =>
//Find the Biggest and Smallest Word in a Sentence
//
//input = “I am Nataraj from Sirkazhi”;
//
//output=>
//        =========
//Biggest word: Sirkazhi
//Smallest word: I
public class BiggestAndSmallestWord {
    public static void main(String[] args) {
        String input = "I am Nataraj from Sirkazhi";
        String[] words = input.split(" ");
        String biggestWord = words[0];
        String smallestWord = words[0];
        for  (int i = 1; i < words.length; i++) {
            if (words[i].length() > biggestWord.length()) {
                biggestWord = words[i];
            }
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
        }
        System.out.println("Biggest word: " + biggestWord);
        System.out.println("Smallest word: " + smallestWord);
    }
}
