package com.coding.java_learning.nataraj.day6;
// Most asked java programming interview questions =>
//Add Two Binary Strings Manually | Without Converting to Decimal
//
//Input:
//=====
//A = “10”, (binary value of 2)
//B = “11” (Binary value of 3)
//
//Output:
//=======
//101 (Binary value of 5)
public class AddTwoBinaryStringsWithoutConvertingDecimal {
    public class Main {
        public static void main(String[] args) {
            // Input binary strings to be added
            String A = "10"; // Represents 2 in decimal
            String B = "11"; // Represents 3 in decimal

            // StringBuilder to efficiently store and build the resulting binary string
            StringBuilder result = new StringBuilder();

            // Pointers starting at the last character (rightmost bit) of each string
            int i = A.length() - 1; // Pointer for string A
            int j = B.length() - 1; // Pointer for string B

            // Variable to keep track of the carry during addition (0 or 1)
            int carry = 0;

            // Loop runs as long as there are characters left to process in A or B,
            // or if there is a remaining carry bit left to append.
            while (i >= 0 || j >= 0 || carry == 1) {

                // Start the current column's sum with the carry from the previous column
                int sum = carry;

                // If string A still has unprocessed bits, add the current bit to sum
                if (i >= 0) {
                    // A.charAt(i) - '0' converts the character '0' or '1' to an integer 0 or 1
                    sum += A.charAt(i) - '0';
                    i--; // Move pointer to the next bit on the left
                }

                // If string B still has unprocessed bits, add the current bit to sum
                if (j >= 0) {
                    // B.charAt(j) - '0' converts the character '0' or '1' to an integer 0 or 1
                    sum += B.charAt(j) - '0';
                    j--; // Move pointer to the next bit on the left
                }

                // Write the bit result for the current position
                // sum % 2 extracts the binary bit (e.g., if sum is 2, 2 % 2 = 0; if sum is 3, 3 % 2 = 1)
                result.append(sum % 2);

                // Update the carry for the next column
                // sum / 2 extracts the carry bit (e.g., if sum is 2, 2 / 2 = 1; if sum is 1, 1 / 2 = 0)
                carry = sum / 2;
            }

            // Since bits were added from right to left, they were appended in reverse order.
            // We must reverse the StringBuilder to get the final correct binary result.
            System.out.println(result.reverse().toString()); // Outputs "101" (5 in decimal)
        }
    }

}

//ASCII Subtraction (A.charAt(i) - '0'): In Java, characters are stored as ASCII values. The character '1' has an ASCII value of 49, and '0' has a value of 48.
// Subtracting '0' from any numeric character yields its literal integer value (\(49 - 48 = 1\)).Modulo (% 2): Determines the bit to keep in the current position.Division (/ 2):
// Determines what value carries over to the next column.Would you like to modify this code to handle negative binary numbers, or should we move on to how to optimize memory usage for very long strings? Please choose one to proceed.
