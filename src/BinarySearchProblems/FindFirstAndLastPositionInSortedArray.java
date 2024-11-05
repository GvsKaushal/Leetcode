package BinarySearchProblems;

// edge case - ( ceil == -1 || ceil == n || nums[ceil] != target )

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 2};
        int val = 3;

        int[] result = searchRange(arr, val);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        if (n == 0) return new int[]{-1, -1};

        int ceil = getCeilIndex(nums, target);
        int floor = getFloorIndex(nums, target);

        if ( ceil == -1 || ceil == n || nums[ceil] != target ) return new int[]{-1, -1};


        return new int[]{ceil, floor};
    }

    private static int getCeilIndex(int[] nums, int target) {

        int ans = -1;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int midIndex = (l + r) / 2;
            int mid = nums[midIndex];

            if (mid >= target) {
                ans = midIndex;
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }

        return ans;
    }

    private static int getFloorIndex(int[] nums, int target) {

        int ans = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int mid = nums[midIndex];

            if (mid <= target) {
                ans = midIndex;
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return ans;
    }
}
