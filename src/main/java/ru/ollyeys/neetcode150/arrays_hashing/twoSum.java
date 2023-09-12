package ru.ollyeys.neetcode150.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (tempMap.containsKey(diff)) {
                return new int[]{i, tempMap.get(diff)};
            }
            tempMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two elements add up to the target.");
    }

    public static void main(String[] args) {
        int[] testArray = {2,7,11,15};
        int t = 9;
        System.out.println(twoSum(testArray, t));
    }
}
