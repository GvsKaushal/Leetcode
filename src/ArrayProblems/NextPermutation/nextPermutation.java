package ArrayProblems.NextPermutation;

import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void findNextPermutation(int[] nums) {

        int n = nums.length;
        int cur = nums.length - 2;

        while (cur >= 0 && nums[cur] >= nums[cur + 1]) {
            cur--;
        }

        if (cur>=0){
            int i = nums.length - 1;
            while (i >= cur && nums[cur] >= nums[i]) {
                i--;
            }
            swapTemp(nums, cur, i);
        }

        Reverse(nums, cur + 1, n - 1);

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
