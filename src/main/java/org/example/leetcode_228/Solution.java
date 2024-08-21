package org.example.leetcode_228;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - end != 1) {
                addRange(list, start, end);
                start = nums[i];
            }
            end = nums[i];
        }
        addRange(list, start, end);
        return list;
    }

    public void addRange(List<String> list, int start, int end) {
        if (start == end) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + end);
        }
    }
}
