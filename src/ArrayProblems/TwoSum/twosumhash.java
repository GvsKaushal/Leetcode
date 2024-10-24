package ArrayProblems.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosumhash {

    public static void main(String[] args) {

        int[] nums = {-5, 1, 3, 5, 7, 9};
        int target = 4;
        int[] result = TwoSum(nums, target);

        System.out.println("Array Index = "+Arrays.toString(result)+" ----> "+nums[result[0]]+" + "+nums[result[1]]+" = "+target);

    }

    public static int[] TwoSum(int[] nums, int target) {

        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int x = target - nums[i];

            if (hash.containsKey(x)) {

                return new int[]{hash.get(x), i};

            }

            hash.put(nums[i], i);
        }

        return null;

    }
}
