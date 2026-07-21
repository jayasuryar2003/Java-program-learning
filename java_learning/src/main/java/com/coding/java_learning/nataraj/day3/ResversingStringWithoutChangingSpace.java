package com.coding.java_learning.nataraj.day3;

// Reverse String without Changing position

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// input = "Hai I am natraj settu"
// output = "uut e sj aratanm aliah"
public class ResversingStringWithoutChangingSpace {
    static void main() {
        String name  = "Hai I am natraj settu";
        ArrayList<Integer> spaceList = new ArrayList<>();

        for (int i = 0; i < name.length()-1; i++) { // --> finding the position for strings
            if(name.charAt(i)==' ')
                spaceList.add(i);
        }
        String temp = "";
        for (int j = name.length()-1; j >0; j--) {
            temp = temp + name.charAt(j);
        }

        temp = temp.replaceAll(" ",""); //--> removing all the spaces   from the reversed  string

        String[] arr = temp.split("");
        ArrayList<String> valueList = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < valueList.size(); i++) {
            if (spaceList.contains(i)) {    // [3,5,8,16].contains(3)
                valueList.add(i," ");
            }
        }

        String output = String.join("",valueList);

        System.out.println("input: "+name);
        System.out.println("output: "+output);







    }
}
