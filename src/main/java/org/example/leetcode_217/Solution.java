package org.example.leetcode_217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { // Note syntax
                return true;
            }
        }
        return false;
    }
}
