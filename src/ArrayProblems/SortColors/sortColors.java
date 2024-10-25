package ArrayProblems.SortColors;

// Dutch National Flag Problem

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {

        int[] arr = {2, 2};

        System.out.println("Before sort = " + Arrays.toString(arr));

        sortNumbers(arr);

        System.out.println("After sort = " + Arrays.toString(arr));

    }

    private static void sortNumbers(int[] nums) {

        int n = nums.length;

        int first = 0;
        int last = n - 1;
        int i = 0;

        while (i <= last) {

            if (nums[i] == 0) {
                swapBit(nums, i, first);
                first++;
                i++;
            } else if (nums[i] == 2) {
                swapBit(nums, i, last);
                last--;
            } else if (nums[i] == 1) {
                i++;
            }
        }
    }

    private static void swapBit(int[] nums, int a, int b) {

        if (nums[a] != nums[b]) {
            nums[a] = nums[a] ^ nums[b];
            nums[b] = nums[a] ^ nums[b];
            nums[a] = nums[a] ^ nums[b];
        }

    }

    private static void swapTemp(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }

    private static void swapAdd(int[] nums, int a, int b) {

        if (nums[a] != nums[b]) {
            nums[a] = nums[a] + nums[b];
            nums[b] = nums[a] - nums[b];
            nums[a] = nums[a] - nums[b];
        }

    }

}
