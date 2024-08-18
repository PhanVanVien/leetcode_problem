package org.example.leetcode_2239;

public class Solution {
     public static int findClosestNumber(int[] nums) {
         int closestValue = Integer.MAX_VALUE;
         int closestNum = Integer.MAX_VALUE; // Use a variable to store the closest number directly

         for (int num : nums) {
             int absNum = Math.abs(num);

             if (absNum < closestValue) {
                 closestValue = absNum;
                 closestNum = num;
             } else if (absNum == closestValue && num > closestNum) {
                 closestNum = num;
             }
         }

         return closestNum;
     }
}
