package StringProblems.Parentheses;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {

        String str = "(()())(())";
        String removeOuterParentheses = removeOuterParentheses(str);
        System.out.println(removeOuterParentheses);
    }

    private static String removeOuterParentheses(String s) {

        int n = s.length();

        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {

                if (count > 0) {
                    stringBuilder.append(s.charAt(i));
                }

                count++;

            } else {

                count--;

                if (count > 0) {
                    stringBuilder.append(s.charAt(i));
                }

            }

        }

        return String.valueOf(stringBuilder);
    }
}
