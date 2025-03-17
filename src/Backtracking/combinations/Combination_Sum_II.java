package Backtracking.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] sum = {0};
        int start = 0;

        Arrays.sort(candidates);

        Dfs(candidates, target, lists, curr, sum, start);

        return lists;
    }

    private static void Dfs(int[] candidates, int target, List<List<Integer>> lists, List<Integer> curr, int[] sum, int start) {
        if (sum[0] > target) {
            return;
        }
        if (sum[0] == target) {
            lists.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] + sum[0] > target) break;

            if (i != start && candidates[i] == candidates[i - 1]) continue;

            sum[0] = sum[0] + candidates[i];
            curr.add(candidates[i]);
            Dfs(candidates, target, lists, curr, sum, i + 1);
            sum[0] = sum[0] - curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);

        }
    }
}
