package ArrayProblems.SumProblems;

// https://www.youtube.com/watch?v=eD95WRfh81c

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(arr, target);
        System.out.println(result);
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = nums[i];

                    sum = sum + nums[j];
                    sum = sum + nums[k];
                    sum = sum + nums[l];

                    if (sum == target) {

                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        lists.add(list);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }

        return lists;
    }
}