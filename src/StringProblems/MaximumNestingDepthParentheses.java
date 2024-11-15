package StringProblems;

import java.util.Stack;

public class MaximumNestingDepthParentheses {

    public static void main(String[] args) {

        String str = "(1+(2*3)+((8)/4))+1";
        int maxDepth = maxDepth(str);
        System.out.println(maxDepth);
    }

    private static int maxDepth(String s) {

        int count = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                stack.pop();
            }
            if (stack.size() > count) {
                count = stack.size();
            }
        }

        return count;
    }
}
