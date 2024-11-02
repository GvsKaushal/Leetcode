package ArrayProblems.MaximumSubarray;

// Kadane's Algorithm
// https://www.youtube.com/watch?v=86CQq3pKSUw


public class maximumSubArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};

        System.out.println("maximum sum = " + maxSubArray(arr));

    }

    private static int maxSubArray(int[] nums) {

        int n = nums.length;

        int finalMax = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < n; i++) {

            if (nums[i] > currentMax + nums[i]) {
                currentMax = nums[i];
            } else {
                currentMax = currentMax + nums[i];
            }

            if (currentMax > finalMax) {
                finalMax = currentMax;
            }

        }

        return finalMax;
    }
}
