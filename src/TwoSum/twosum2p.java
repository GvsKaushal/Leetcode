package TwoSum;

import java.util.Arrays;

public class twosum2p {
    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution, return an empty array
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {-5, 1, 3, 5, 7, 9};
        int target = 4;
        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
