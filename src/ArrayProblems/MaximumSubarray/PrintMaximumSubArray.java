package ArrayProblems.MaximumSubarray;


import java.util.Arrays;

public class PrintMaximumSubArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};

        System.out.println("Array = " + Arrays.toString(arr));

        int[] result = printMaxSubArray(arr);

        System.out.println("Array = " + Arrays.toString(result));
    }

    private static int[] printMaxSubArray(int[] nums) {

        int n = nums.length;

        int finalMax = nums[0];
        int currentMax = nums[0];

        int firstIndex = 0;
        int lastIndex = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] > currentMax + nums[i]) {
                currentMax = nums[i];
                firstIndex = i;

            } else {
                currentMax = currentMax + nums[i];
            }

            if (currentMax > finalMax) {
                finalMax = currentMax;
                lastIndex = i;
            }

        }

        int[] array = new int[(lastIndex - firstIndex) + 1];
        int count = 0;

        for (int j = firstIndex; j <= lastIndex; j++) {
            array[count] = nums[j];
            count++;
        }

        return array;
    }
}
