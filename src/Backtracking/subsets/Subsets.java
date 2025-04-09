package Backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {

        int[] num = {1, 2, 3};
        System.out.println(subsets(num));

    }

    private static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int first = 0;

        Dfs(nums, lists, curr, first);

        return lists;
    }

    private static void Dfs(int[] nums, List<List<Integer>> lists, List<Integer> curr, int first) {

        lists.add(new ArrayList<>(curr));

        for (int i = first; i < nums.length; i++) {
            curr.add(nums[i]);
            Dfs(nums, lists, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }


}
