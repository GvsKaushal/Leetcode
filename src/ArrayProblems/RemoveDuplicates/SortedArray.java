package ArrayProblems.RemoveDuplicates;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = RemoveDuplicatesFromSortedArray(arr);
        System.out.println("length = " + result + " array = " + Arrays.toString(arr));
    }

    private static int RemoveDuplicatesFromSortedArray(int[] nums) {
        int len = nums.length;

        if (len == 0) {
            return 0;
        }

        int firstIndex = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[firstIndex] = nums[i];
                firstIndex++;
            }
        }

        return firstIndex;
    }
}
