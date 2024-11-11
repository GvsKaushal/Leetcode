package BinarySearchProblems.Painterspartition;

// Book Allocation Problem
// Painter's partition

import java.util.Arrays;

public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] array = {7, 2, 5, 10, 8};
        int k = 2;

        int min = splitArray(array, k);
        System.out.println(min);

    }

    private static int splitArray(int[] nums, int k) {

        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();

        int ans = -1;

        while (left <= right) {

            int midIndex = (left + right) / 2;

            int Max = getMaxBySplittingArray(nums, midIndex);

            if (Max <= k) {
                ans = midIndex;
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }

        }
        return ans;
    }

    private static int getMaxBySplittingArray(int[] nums, int MaxUnits) {

        int painter = 1;
        int units = 0;

        for (int i = 0; i < nums.length; i++) {

            if (units + nums[i] <= MaxUnits) {
                units = units + nums[i];
            } else {
                painter++;
                units = nums[i];
            }
        }

        return painter;
    }
}
