package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int unique = 0;

        for (int num : nums) {
            unique ^= num; // xOR  - повторяющиеся элементы будут сокращаться (коммут, ассоц)
        }

        return unique;

    }

//    public static int singleNumber(int[] nums) {
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        Set<Integer> repeatedNumbers = new HashSet<>();
//
//        for (int num : nums) {
//            if (uniqueNumbers.contains(num)) {
//                repeatedNumbers.add(num);
//            } else {
//                uniqueNumbers.add(num);
//            }
//        }
//
//        uniqueNumbers.removeAll(repeatedNumbers);
//
//        if (!uniqueNumbers.isEmpty()) {
//            return uniqueNumbers.iterator().next();
//        }
//
//        return 0;
//    }


    public static void main(String[] args) {
        int[] test = {-1, -1, -2};
        System.out.println(singleNumber(test));
    }
}
