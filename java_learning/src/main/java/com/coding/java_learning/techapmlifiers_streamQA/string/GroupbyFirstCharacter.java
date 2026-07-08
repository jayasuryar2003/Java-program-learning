package com.coding.java_learning.techapmlifiers_streamQA.string;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 34 Question: Group a list of strings by their first character.
public class GroupbyFirstCharacter {
    static void main() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
        Map<Character, List<String>> groupedByFirstChar = words.stream()


                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(groupedByFirstChar);
// mistakes I made here first thing is I forget I have to give only one condition  inside the groupingBy I was looking for one more condition
        // but that second list condition it will automaically take
        // important : clearly give what we  wrraper objects we need to give   Map<Character, List<String>>
        //  Map<String, List<Interger>> --> this is totally wrong

    }
}
