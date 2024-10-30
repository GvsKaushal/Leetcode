package ArrayProblems.MaximumSubarray;

// https://www.youtube.com/watch?v=hnswaLJvr6g
// prefix = 1 * ->
// suffix = 1 * <-

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};
        System.out.println("maximum Product = " + maxProduct(arr));
    }

    private static int maxProduct(int[] nums) {

        int n = nums.length;

        int prefix = 1;
        int suffix = 1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (prefix == 0) {
                prefix = 1;
            }

            prefix = prefix * nums[i];

            if (prefix > max) {
                max = prefix;
            }
        }

        for (int i = n - 1; i >= 0; i--) {

            if (suffix == 0) {
                suffix = 1;
            }

            suffix = suffix * nums[i];

            if (suffix > max) {
                max = suffix;
            }
        }

//        max = Math.max(max, Math.max(prefix, suffix));

        return max;
    }
}
