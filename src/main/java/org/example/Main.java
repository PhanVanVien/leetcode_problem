package org.example;

import java.util.*;

public class Main {
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int searchInsertPosition(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] bubbleSort(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.println(count);
            count++;
        }
        return nums;
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && temp < nums[j]) {
                System.out.print(temp + " " + j);
                System.out.println();
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
        return nums;
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            System.out.println(digit);
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            result = result * 10 + digit;
            System.out.println(result);
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int countDiff = 0;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            System.out.println(nums[j - 1] + " " + nums[j]);
            if (nums[j - 1] != nums[j]) {
                nums[i] = nums[j];
                i++;
                countDiff++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        return countDiff;
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) maxSum = currentSum;
            if (num < 0) currentSum = 0;
        }
        return maxSum;
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        if (n == 1) return nums[0];
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > n / 2) {
                    return num;
                }
            }
        }
        return 0;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                results.addLast(true);
            } else {
                results.addLast(false);
            }
        }

        return results;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;

        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] results = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            results[index] = map.get(heights[i]);
            index++;
        }
        return results;
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length;
        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            return isOdd(arr[i]) && isOdd(arr[i + 1]) && isOdd(arr[i + 2]);
        }
        return false;
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid < x) {
                left = mid + 1;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;

        int indexTyped = 0;
        int indexName = 0;
        while (indexTyped < typed.length()) {
            if (indexName < name.length() && typed.charAt(indexTyped) == name.charAt(indexName)) {
                indexName++;
            } else if (indexTyped == 0 || typed.charAt(indexTyped) != typed.charAt(indexTyped - 1)) {
                return false;
            }
            indexTyped++;
        }
        return indexName == name.length();
    }

    public int removeDuplicatesII(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int[] twoSumI(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            // if c is open bracket push to Stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char temp = stack.peek();
                    if (temp == '(' && c == ')'
                            || temp == '[' && c == ']'
                            || temp == '{' && c == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isPalindrome(String s) {
//        String preProcessString = "";
//        for (char c : s.toCharArray()) {
//            if (c >= 'a' && c <= 'z'
//                    || c >= 'A' && c <= 'Z'
//                    || c >= '0' && c <= '9') {
//                preProcessString += c;
//            }
//        }
//        int leftPointer = 0;
//        int rightPointer = preProcessString.length() - 1;
//        preProcessString = preProcessString.toLowerCase();
//        System.out.println(preProcessString);
//        while (leftPointer <= rightPointer) {
//            if (preProcessString.charAt(leftPointer)
//                    != preProcessString.charAt(rightPointer)) {
//                return false;
//            }
//            leftPointer++;
//            rightPointer--;
//        }
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer <= rightPointer) {
            char charAtLeftPointer = s.charAt(leftPointer);
            char charAtRightPointer = s.charAt(rightPointer);
            if (!isLetterOrDigit(charAtLeftPointer)) {
                leftPointer++;
            } else if (!isLetterOrDigit(charAtRightPointer)) {
                rightPointer--;
            } else {
                if (Character.toLowerCase(charAtLeftPointer)
                        != Character.toLowerCase(charAtRightPointer)) {
                    return false;
                }
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }

    public static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9');
    }

    public static int maxSubArrayI(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                System.out.println(maxSum);
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static String concat1(String s1) {
        s1 = s1 + "forgeeks";
        return s1;
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static int longestOnes(int[] nums, int k) {
        int countZero = 0;
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                countZero++;
            }
            while (countZero > k) {
                if (nums[left] == 0) {
                    countZero--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static int characterReplacement(String s, int k) {
        int lengthLongest = 0;
        int left = 0;
        int right = 0;
        int[] charCount = new int[26];
        while (right < s.length()) {
            charCount[s.charAt(right) - 'A']++;

            lengthLongest = Math.max(lengthLongest, right - left + 1);

            right++;
        }
        return lengthLongest;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }
}