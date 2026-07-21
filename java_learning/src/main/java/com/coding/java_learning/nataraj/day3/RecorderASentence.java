package com.coding.java_learning.nataraj.day3;

import java.util.ArrayList;

// Recorder a sentence based on numbers embedded in words = ZOHO
// input = "is1 thi0s T3est 2a"
// output = "This is a Test"
public class RecorderASentence {
    static void main() {
     String str = "is1 thi0s T3est 2a";

     String[] arr = str.split(" ");
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();


        for (String str1 : arr) {
            String letters = "";
            String digits = "";

            for (char c : str1.toCharArray()) {
                if (Character.isDigit(c)) {
                    digits += c;
                }
                else  {
                    letters += c;
                }
            }
            numbers.add(digits);
            words.add(letters);



        }
        String count = "";
        for (int i = 0; i < words.size(); i++) {
            count += words.get(numbers.indexOf(String.valueOf(i)))+" "; //---> getting the index from the loop converting it to the index value for numbers basically we are comparing two list and list variables
            // lopp variables will say hi i am index  0 list say ok 0 will bhe present in 1 index so got to word list and get the 1 index element from the word list and add it to the string variable
        }
        System.out.println(count);
    }
}

//// Original
//count += words.get(numbers.indexOf(String.valueOf(0))) + " ";
//
/// / 1. Convert integer to String
//count += words.get(numbers.indexOf("0")) + " ";
//
//// 2. Find the index of "0" (returns integer 1)
//count += words.get(1) + " ";
//
//// 3. Get the word at index 1 ("this")
//count += "this" + " ";
