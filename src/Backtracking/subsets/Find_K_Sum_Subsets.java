package Backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Find_K_Sum_Subsets {

    public static void main(String[] args) {

        int[] num = {5, 2, 3, 10, 6, 8};
        int target = 10;
        System.out.println(getKSumSubsets(num, target));

    }

    private static List<List<Integer>> getKSumSubsets(int[] nums, int target) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] sum = new int[1];

        int first = 0;

        Dfs(nums, lists, curr, first, sum, target);

        return lists;

    }


    private static void Dfs(int[] nums, List<List<Integer>> lists, List<Integer> curr, int first, int[] sum, int target) {

        if (sum[0] == target) {
            lists.add(new ArrayList<>(curr));
        }

        for (int i = first; i < nums.length; i++) {

            if (sum[0] > target) break;

            curr.add(nums[i]);
            sum[0] = sum[0] + nums[i];
            Dfs(nums, lists, curr, i + 1, sum, target);
            sum[0] = sum[0] - curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);
        }
    }
}
