package BinarySearchProblems.Similar_2;

// KokoEatingBananas same

import java.util.Arrays;

public class FindTheSmallestDivisorGivenAThreshold {

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int result = smallestDivisor(nums, threshold);
        System.out.println(result);
    }

    private static int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();

        int Divisor = -1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int Th = getThreshold(nums, midIndex);

            if (Th <= threshold) {
                Divisor = midIndex;
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        return Divisor;
    }

    private static int getThreshold(int[] nums, int divisor) {

        int ans = 0;

        // math.cell replace
        for (int n : nums) {
            ans = ans + (n + divisor - 1) / divisor;
        }

        return ans;

    }


}
