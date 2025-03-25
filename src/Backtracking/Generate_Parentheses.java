package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

    public static void main(String[] args) {

        int n = 3;

        System.out.println(generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        int open = 0;
        int close = 0;

        Dfs(n, list, "", open, close);

        return list;
    }

    private static void Dfs(int n, List<String> list, String str, int open, int close) {

        if (n * 2 == str.length()) {
            list.add(str);
            return;
        }

        if (open < n) {
            Dfs(n, list, str + "(", open + 1, close);
        }
        if (close < open) {
            Dfs(n, list, str + ")", open, close + 1);
        }
    }
}
