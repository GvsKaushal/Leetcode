package StringProblems.Parentheses;

import java.util.Stack;

public class MaximumNestingDepthParentheses {

    public static void main(String[] args) {

        String str = "(1+(2*3)+((8)/4))+1";
        int maxDepth = maxDepth(str);
        System.out.println(maxDepth);
    }

    private static int maxDepth(String s) {

        int count = 0;
        int mac_count = 0;


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count > mac_count) {
                mac_count = count;
            }
        }

        return mac_count;
    }
}
