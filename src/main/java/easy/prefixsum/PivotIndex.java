package easy.prefixsum;

import java.util.Arrays;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[n - 1] = 0;
        int k = 0;
        for (int i = 1; i < n; i++) {
            k = n - i - 1;
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            rightSum[k] = rightSum[k + 1] + nums[k + 1];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
//        Arrays.stream(leftSum)
//                .forEach(System.out::println);
//
//        Arrays.stream(rightSum)
//                .forEach(System.out::println);

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

}
