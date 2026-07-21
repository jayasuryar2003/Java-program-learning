package com.coding.java_learning.nataraj.day3;

// Reverse words at alternative positions in the string
// Input: "Java is the best programme language"
// output: "Java si the tseb programme egaugnal"
public class ReverseAStringInAlternativePosition {
    static void main() {
     String  str = "Java is the best programme language";
     String[] arr = str.split( " ");
     String output = "";
     for(int i=0;i<arr.length;i++){
         if (i%2==0){
            output += arr[i]+" ";
         }
         else {
                String temp = arr[i];
                String rev="";
                for(int j=temp.length()-1;j>=0;j--){
                    rev+=temp.charAt(j);
                }
                output += rev+" ";

         }
     }
        System.out.println(output);

    }
}
