package Backtracking.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {

    public static void main(String[] args) {

        int[] num = {1, 2, 2};
        System.out.println(subsetsWithDup(num));

    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int first = 0;

        Arrays.sort(nums);

        Dfs(nums, lists, curr, first);

        return lists;

    }

    private static void Dfs(int[] nums, List<List<Integer>> lists, List<Integer> curr, int first) {

        lists.add(new ArrayList<>(curr));

        for (int i = first; i < nums.length; i++) {
            if (i != first && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            Dfs(nums, lists, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
