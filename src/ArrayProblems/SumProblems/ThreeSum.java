package ArrayProblems.SumProblems;

// leetcode video
// you can remove duplicates hashset

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);

    }

    private static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        HashSet<List<Integer>> lists = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = (nums[i]) + (nums[left]) + (nums[right]);

                if (sum == 0) {

                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    Collections.sort(list);
                    lists.add(list);

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }

            }
        }

        return new ArrayList<>(lists);
    }
}
