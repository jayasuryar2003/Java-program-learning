package com.coding.java_learning.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 1.Character count in string
// 2. Repeated consecutive charactes count
// input = "Nataraj java programming"
// output => =2,p=1,a=6,r=3,t=1,v=1,g=2,i=1,j=2,m=2,n=2,o=1 ==> by seeing thois you say it is a
// output => n=2,a=6,r=3,j=2,m=2,g=2
public class CountTheRepeatedCharacterInString {
    public static void main(String[] args) {
        String str = "Nataraj java programming".toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);

            if(map.containsKey(strChar)){
                int newValue = map.get(strChar)+1;
                map.put(strChar,newValue);
            }
            else {
                map.put(strChar,1);
            }

        }
        System.out.println(map);
        Set<Map.Entry<Character,Integer>> entry = map.entrySet();
        for (Map.Entry<Character,Integer> keyAndVaue:entry){
            System.out.println(keyAndVaue);
        }
    }

}
