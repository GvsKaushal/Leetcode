package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(letterCombinations(digits));
    }


    private static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if (digits.isEmpty()) {
            return list;
        }

        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        dfs(digits, 0, new StringBuilder(), list, mapping);

        return list;
    }

    private static void dfs(String digits, int start, StringBuilder stringBuilder, List<String> list, String[] mapping) {

        if (digits.length() == stringBuilder.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        char ch = digits.charAt(start);
        String str = mapping[ch - '0'];
        for (char c : str.toCharArray()) {
            stringBuilder.append(c);
            dfs(digits, start + 1, stringBuilder, list, mapping);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

}
