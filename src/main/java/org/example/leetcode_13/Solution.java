package org.example.leetcode_13;

public class Solution {
    public static int convertRomanToNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (convertRomanToNumber(s.charAt(i)) < prev) {
                result -= convertRomanToNumber(s.charAt(i));
            } else {
                result += convertRomanToNumber(s.charAt(i));
            }
            prev = convertRomanToNumber(s.charAt(i));
        }
        return result;
    }
}
