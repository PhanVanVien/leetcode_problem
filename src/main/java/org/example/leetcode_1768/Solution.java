package org.example.leetcode_1768;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int word1Index = 0;
        int word2Index = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();

        StringBuilder mergedString = new StringBuilder();

        while (word1Index < word1Length || word2Index < word2Length) {
            if (word1Index < word1Length) {
                mergedString.append(word1.charAt(word1Index));
                word1Index++;
            }
            if (word2Index < word2Length) {
                mergedString.append(word2.charAt(word2Index));
                word2Index++;
            }
            word1Index++;
        }

        return mergedString.toString();
    }
}