package org.example.leetcode_392;

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return j == s.length();
    }
}
