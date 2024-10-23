package ArrayProblems.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class twosumhash {

    public static void main(String[] args) {
        int[] nums = {-5, 1, 3, 5, 7, 9};
        int target = 4;
        int[] result = helper(nums, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] helper(int[] nums, int target) {
        HashMap<Integer, Integer> k = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int rem = target - cur;

            if (k.containsKey(rem)) {
                return new int[]{rem, cur};
            } else {
                k.put(cur, i);
            }
        }
        return new int[]{-1, -1};
    }
}
