package ArrayProblems.RemoveDuplicates;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = RemoveDuplicatesFromSortedArray(arr, val);
        System.out.println("length = " + result + " array = " + Arrays.toString(arr));

    }

    private static int RemoveDuplicatesFromSortedArray(int[] nums, int val) {

        int len = nums.length;
        int firstIndex = 0;

        for (int secondIndex = 0; secondIndex < len; secondIndex++) {
            if (nums[secondIndex] != val) {
                nums[firstIndex] = nums[secondIndex];
                firstIndex++;
            }
        }

        return firstIndex;
    }
}
