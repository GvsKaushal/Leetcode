package StackProblems;

// increasing stack
// edge case (count)
// https://www.youtube.com/watch?v=jmbuRzYPGrg

import java.util.Stack;

public class Remove_K_Digits {

    public static void main(String[] args) {

        String string = "10200";
        int k = 1;
        String result = removeKdigits(string, k);
        System.out.println(result);
    }

    private static String removeKdigits(String num, int k) {

        num = removeTailingZeros(num);

        int len = num.length();

        if (k >= len) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        int count = k;

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && count > 0 && stack.peek() > num.charAt(i)) {
                stack.pop();
                count--;
            }
            stack.push(num.charAt(i));
        }

        while (count > 0) {
            stack.pop();
            count--;
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();

        String result = removeTailingZeros(String.valueOf(stringBuilder));

        if (len == result.length()) {
            return result.substring(0, len - k);
        }

        return result;
    }

    private static String removeTailingZeros(String s) {

        int i = 0;
        int n = s.length();

        if (s.charAt(i) == '0') {
            while (i < n && s.charAt(i) == '0') {
                i++;
            }
        }
        if (i == n) {
            return "0";
        }
        s = s.substring(i);

        return s;
    }

}
