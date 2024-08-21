package org.example.leetcode_14;

public class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder tempPrefix = new StringBuilder();
        String commonPrefix = v[0];
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < Math.min(commonPrefix.length(), v[i].length()); j++) {
                if (commonPrefix.charAt(j) == v[i].charAt(j)) {
                    tempPrefix.append(commonPrefix.charAt(j));
                } else {
                    break;
                }
            }
            commonPrefix = tempPrefix.toString();
            tempPrefix = new StringBuilder();
        }
        return commonPrefix;
    }
}
