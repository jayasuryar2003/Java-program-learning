package com.coding.java_learning.techapmlifiers_streamQA.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//39.Question: Find the word with the most vowels in a list.
public class FindtheWordwithMaximumVowels {
    static void main() {
        List<String> words = Arrays.asList("stream", "java", "programming", "awesome");
        String wordWithMostVowels = words.stream()
                .max(Comparator.comparingInt(word -> (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count()))
                .orElse(null);
        System.out.println(wordWithMostVowels);


                // return type of max is optional

        // .max(Comparator.comparingInt(word this will come store as list of integer in that value max find which value it is
         //.max(Comparator.comparingInt(word -> (int) word.chars(). this is way to split a single string

        //filter(c -> "aeiou".indexOf(c) != -1).count())) --> we are checking the index of our created string value aeiou if the index is equal to -1 it will get failed




    }






    //The chars() function is a tool in Java used to break a piece of text (a String) down into its individual letters and symbols so you
    // can work with them one by one.How It WorksIt returns a Stream: It converts your text into a sequence of data (a IntStream) that you can
    // loop through or filter.It uses numbers: Computers see letters as numbers (ASCII/Unicode values). The chars() function gives you these number
    // codes instead of the actual text letters. For example, the letter 'A' becomes the number 65.A Quick ExampleIf you want to print every letter of a word on a new line,
    // you can use chars() like this:javaString word = "Hello";
    //
    //word.chars()
    //    .mapToObj(c -> (char) c) // Converts the numbers back into readable letters
    //    .forEach(System.out::println);
    //Use code with caution.Common UsesDevelopers usually use chars() when they need to:Count how many times a specific letter appears in a sentence.Filter out numbers or punctuation from a piece of text.Check if a word reads the same backward (a palindrome).
}
