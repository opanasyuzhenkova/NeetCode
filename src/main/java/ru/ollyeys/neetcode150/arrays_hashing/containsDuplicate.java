package ru.ollyeys.neetcode150.arrays_hashing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class containsDuplicate {
    public static boolean containsDups(int[] nums) {

        Set<Integer> intArray = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        if (intArray.size() < nums.length) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        boolean result = containsDuplicate.containsDups(nums);
        System.out.println(result);
    }
}
