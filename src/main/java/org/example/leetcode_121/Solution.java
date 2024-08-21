package org.example.leetcode_121;

public class Solution {
    public int maxProfit(int[] priceOfDate) {
        int min = priceOfDate[0];
        int maxProfit = 0;

        for (int i = 1; i < priceOfDate.length; i++) {
            if (min > priceOfDate[i]) {
                min = priceOfDate[i];
            } else {
                maxProfit = Math.max(priceOfDate[i] - min, maxProfit);
            }
        }
        return maxProfit;
    }
}
