package ArrayProblems.RearrangeArrayElements;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {

        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = RearrangeArray(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] RearrangeArray(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int positive = 0;
        int negative = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[positive] = nums[i];
                positive = positive + 2;
            } else if (nums[i] < 0) {
                result[negative] = nums[i];
                negative = negative + 2;
            }
        }

        return result;
    }

}
