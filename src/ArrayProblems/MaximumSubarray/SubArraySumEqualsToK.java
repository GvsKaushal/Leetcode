package ArrayProblems.MaximumSubarray;

// leetcode https://leetcode.com/problems/subarray-sum-equals-k/editorial/
// not video

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySumEqualsToK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("Array = " + Arrays.toString(arr));

        int result = subArraySum(arr, 3);

        System.out.println(result);
    }

    private static int subArraySum(int[] nums, int k) {

        int n = nums.length;

        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < n; i++) {

            sum = sum + nums[i];

            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
}
