package org.example.leetcode_771;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int result = 0;

        for (char jewel : jewels.toCharArray()) {
            set.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (set.contains(stone)) result++;
        }

        return result;
    }
}
