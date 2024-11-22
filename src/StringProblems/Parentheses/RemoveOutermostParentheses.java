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

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {

                if (!stack.empty()) {
                    stringBuilder.append(s.charAt(i));
                }

                stack.push('(');

            } else {

                stack.pop();

                if (!stack.empty()) {
                    stringBuilder.append(s.charAt(i));
                }

            }

        }

        return String.valueOf(stringBuilder);
    }
}
