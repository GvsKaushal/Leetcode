package ArrayProblems.NextPermutation;

import java.util.Arrays;

// https://www.youtube.com/watch?v=IhsUbEMfIbY


public class nextPermutation {

    public static void main(String[] args) {

        int[] nums = {3, 7, 5, 2, 1};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void findNextPermutation(int[] nums) {

        int n = nums.length;

        int last = n - 2;

        while (last >= 0 && nums[last] >= nums[last + 1]) {
            last--;
        }

        if (last >= 0) {

            for (int i = n - 1; i > last; i--) {
                if (nums[i] > nums[last]) {
                    swapTemp(nums, i, last);
                    break;
                }
            }

        }

        Reverse(nums, last + 1, n - 1);

    }

    private static void Reverse(int[] arr, int first, int last) {

        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    private static void swapTemp(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
