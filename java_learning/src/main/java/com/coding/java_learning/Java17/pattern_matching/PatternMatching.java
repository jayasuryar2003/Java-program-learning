package com.coding.java_learning.Java17.pattern_matching;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        if (obj instanceof String ) {
            String str = (String) obj;
            System.out.println("The string is: " + str);
        } else if (obj instanceof Integer ) {
            Integer I = (Integer) obj;
            System.out.println("The string is: " + I);

        }



        //After java 17, we can use pattern matching for instanceof operator. It allows us to test if an object is of a certain type and, if so, cast it to that type in a single step. This can make our code more concise and easier to read.
        if (obj instanceof String str) {
            System.out.println("The string is: " + str);
        } else {
            System.out.println("Not a string");
        }


        // After 21 we have pattern matching for switch statement. It allows us to test an object against multiple patterns and execute different code based on which pattern matches. This can make our code more concise and easier to read.
        switch (obj) {
            case String str when str.length() > 10  -> System.out.println("The string is: " + str);
            case Integer i when i>=10  -> System.out.println("The integer is: " + i);
            case null -> System.out.println("The object is null");
            default -> System.out.println("Not a string or integer");
        }
    }
}
