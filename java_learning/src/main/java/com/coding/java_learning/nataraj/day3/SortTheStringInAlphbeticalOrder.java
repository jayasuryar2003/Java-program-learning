package com.coding.java_learning.nataraj.day3;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Sort the string in the alphabetical order
// Input = "defaceable"
//output =  "aabcdeeefl"
public class SortTheStringInAlphbeticalOrder {
    static void main() {
       String str = "defaceable";
       TreeMap<Character, Integer> map = new TreeMap<>(); // strore the values in alphabetical order

        for( int i = 0; i < str.length(); i++ ) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else{
                map.put(str.charAt(i), 1);
            }
        }

        String result = "";
        Set<Map.Entry<Character,Integer>> entry = map.entrySet(); // --> use key entryset it has other two keySet and entryset

        for(Map.Entry<Character,Integer> entry1 : entry){
            for(int i = 0; i < entry1.getValue(); i++){
                result += entry1.getKey();
            }
        }
        System.out.println(result);

    }
}
