package com.coding.java_learning.nataraj.day5;

/**
 * PROBLEM: Alphabet Shift Based on Digits
 *
 * CORE LOGIC:
 * 1. Read the input string character by character.
 * 2. If the character is an alphabet letter, keep it unchanged in the output.
 * 3. If the character is a numeric digit, replace it by shifting the
 *    IMMEDIATELY PRECEDING alphabet letter forward by that digit's value.
 *
 * WALKTHROUGH FOR INPUT: "a1b2c3d6e"
 * -------------------------------------------------------------------------
 * Current Char | Type    | Action Taken                     | Current Output
 * -------------------------------------------------------------------------
 * 'a'          | Letter  | Keep as is                       | a
 * '1'          | Digit   | Shift preceding 'a' by 1 -> 'b'  | ab
 * 'b'          | Letter  | Keep as is                       | abb
 * '2'          | Digit   | Shift preceding 'b' by 2 -> 'd'  | abbd
 * 'c'          | Letter  | Keep as is                       | abbdc
 * '3'          | Digit   | Shift preceding 'c' by 3 -> 'f'  | abbdcf
 * 'd'          | Letter  | Keep as is                       | abbdcfd
 * '6'          | Digit   | Shift preceding 'd' by 6 -> 'j'  | abbdcfdj
 * 'e'          | Letter  | Keep as is                       | abbdcfdje
 * -------------------------------------------------------------------------
 * FINAL OUTPUT: "abbdcfdje"
 */
// Most asked java programming interview questions => Alphabet Shift Based on Digits
//
//Input: “alb2c3d6e”
public class AlphabetShiftBasedOnDigits {
    static void main() {
        String str = "a1b2c3d6e";
        char ch[] = str.toCharArray();
        String val = "";
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
//                int num = Character.getNumericValue(ch[i]);
                int num = Integer.parseInt(String.valueOf(ch[i]));
                int previciousCgharAscii = (int) ch[i-1];
                char shift = (char)(previciousCgharAscii+num);
                val = val + shift;
            }
            else  {
                val = val + ch[i];
            }
        }
        System.out.println(val);
    }
}
