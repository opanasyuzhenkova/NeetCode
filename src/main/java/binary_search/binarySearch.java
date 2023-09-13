package binary_search;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] testArray = {-1, 0,  3, 5,  9, 12};
        System.out.println(search(testArray, 9));
    }
}
