package StackProblems;

import java.util.HashMap;
import java.util.Stack;

// use HashMap to store Parentheses

public class ValidParentheses {

    public static void main(String[] args) {

        String string = "([])";
        boolean isValidParentheses = isValid(string);
        System.out.println(isValidParentheses);
    }

    private static boolean isValid(String s) {

        int len = s.length();

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');

        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {

                stack.push(s.charAt(i));

            } else if ((!stack.isEmpty()) && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {

                char c = stack.pop();

                if (hashMap.get(c) != s.charAt(i)) {
                    return false;
                }

            } else {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
