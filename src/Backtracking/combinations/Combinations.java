package Backtracking.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {

        int n = 3;
        int k = 2;
        System.out.println(combine(n, k));

    }

    private static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int first = 1;

        Dfs(n, k, lists, curr, first);

        return lists;
    }

    private static void Dfs(int n, int k, List<List<Integer>> lists, List<Integer> curr, int first) {

        if (curr.size() == k) {
            lists.add(new ArrayList<>(curr));
            return;
        }

        for (int i = first; i <= n; i++) {
            curr.add(i);
            Dfs(n, k, lists, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
