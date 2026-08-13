package com.coding.java_learning.nataraj.day5;

// Most asked java programming interview questions => Left Rotate an Array by K Positions
// input => {1,2,3,4,5} | Left_Rotate => 2
// output => {3,4,5,1,2}
public class RotateArrayInLeftKPosition {

    public static void main(String[] args) { // Fixed: Added standard main signature
        int[] inputArray = {1, 2, 3, 4, 5};
        int rotate = 2;

        rotate = rotate % inputArray.length;

        for (int r = 0; r < rotate; r++) {
            int first = inputArray[0];

            // Fixed: Started loop at 0 instead of 1 to shift the first element
            for (int i = 0; i < inputArray.length - 1; i++) {
                inputArray[i] = inputArray[i + 1];
            }

            inputArray[inputArray.length - 1] = first;
        }

        // Print the result
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " "); // Fixed: Changed println to print for inline output
        }
    }
}

