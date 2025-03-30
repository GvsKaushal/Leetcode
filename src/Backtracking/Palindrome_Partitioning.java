package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

    public static void main(String[] args) {

        String s = "aab";
        System.out.println(partition(s));

    }

    private static List<List<String>> partition(String s) {

        List<List<String>> lists = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        dfs(s, 0, curr, lists);

        return lists;
    }

    private static void dfs(String s, int start, List<String> curr, List<List<String>> lists) {

        int len = s.length();

        if (len == start) {
            lists.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < len; i++) {
            if (isPalindrome(s, start, i)) {
                curr.add(s.substring(start, i + 1));
                dfs(s, i + 1, curr, lists);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
