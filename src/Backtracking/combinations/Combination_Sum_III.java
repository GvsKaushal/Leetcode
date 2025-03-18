package Backtracking.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {

    public static void main(String[] args) {

        int k = 3;
        int n = 7;

        System.out.println(combinationSum3(k, n));
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> lists = new ArrayList<>();

        if (k > n) return lists;

        List<Integer> curr = new ArrayList<>();
        int[] sum = {0};
        int start = 1;

        Dfs(n, k, lists, curr, sum, start);

        return lists;
    }

    private static void Dfs(int target, int len, List<List<Integer>> lists, List<Integer> curr, int[] sum, int start) {


        if (sum[0] == target && curr.size() == len) {
            lists.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= 9; i++) {

            if (sum[0] + i > target) break;

            sum[0] = sum[0] + i;
            curr.add(i);
            Dfs(target, len, lists, curr, sum, i + 1);
            sum[0] = sum[0] - curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);

        }
    }
}
