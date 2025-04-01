package Backtracking.Permutations;

import java.util.ArrayList;
import java.util.List;


public class Permutations {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }

    private static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Dfs(nums, lists, curr);

        return lists;
    }

    private static void Dfs(int[] nums, List<List<Integer>> lists, List<Integer> curr) {

        if (curr.size() == nums.length) {
            lists.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!curr.contains(nums[i])) {
                curr.add(nums[i]);
                Dfs(nums, lists, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }

}
