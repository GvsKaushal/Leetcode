package ArrayProblems.MoveZeroes;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroesToEnd(int[] nums) {

        int n = nums.length;
        int firstIndex = 0;

        for (int secondIndex = 0; secondIndex < n; secondIndex++) {
            if (nums[secondIndex] != 0) {
                nums[firstIndex] = nums[secondIndex];
                firstIndex++;
            }
        }
        for (int i = firstIndex; i < n; i++) {
            nums[i] = 0;
        }
    }
}
