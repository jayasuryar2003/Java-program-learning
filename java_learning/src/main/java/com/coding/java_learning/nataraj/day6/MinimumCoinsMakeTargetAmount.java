package com.coding.java_learning.nataraj.day6;

//Most asked java programming interview questions =>
//Minimum Coins to Make Target Amount
//
//input=>
//=======
//coins = {1,5,10,20,50}
//target=>138
//
//Output=>8 coints
public class MinimumCoinsMakeTargetAmount {
    static void main() {
        int[] coins = {1, 5, 10, 20, 50};
        int target = 138;
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (target >= coins[i]) {
                target -= coins[i];
                count++;
            }
        }

        System.out.println("Minimum coins needed: " + count);
    }
}


//// Input array of coin denominations, sorted in ascending order
//        int[] coins = {1, 5, 10, 20, 50};
//        // The target amount for which we want to find the minimum number of coins
//        int target = 138;
//
//        // Variable to track the total count of coins used
//        int count = 0;
//
//        // Iterate backwards from the largest coin denomination down to the smallest
//        for (int i = coins.length - 1; i >= 0; i--) {
//
//            // If the remaining target amount is greater than or equal to the current coin value
//            if (target >= coins[i]) {
//
//                // Add the maximum possible number of the current coin denomination to the count
//                // e.g., 138 / 50 = 2 coins of 50
//                count += target / coins[i];
//
//                // Update the target to be the remaining remainder after taking those coins
//                // e.g., 138 % 50 = 38 remaining target
//                target = target % coins[i];
//            }
//        }
//
//        // Print the final minimum number of coins used
//        System.out.println(count); // For 138, outputs: 7 (Two 50s, one 20, one 10, one 5, three 1s)
//    }