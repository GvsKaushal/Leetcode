package BinarySearchProblems.Upper_LowerBound;

// Notes

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1};
        int val = 1;

        System.out.println(Arrays.toString(arr));

        int[] result = searchRange(arr, val);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) return new int[]{-1, -1};

        int lower = lowerBound(nums, target);

        if (nums[lower] != target) return new int[]{-1, -1};

        int upper = upperBound(nums, target) - 1;


        return new int[]{lower, upper};
    }

    private static int lowerBound(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1; // Move left
            } else {
                low = mid + 1; // Move right
            }
        }

        return low;
    }

    private static int upperBound(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1; // Move left
            } else {
                low = mid + 1; // Move right
            }
        }

        return low;
    }
}
