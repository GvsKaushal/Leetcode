package StackProblems.NextGreater;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerToRight {

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        int[] result = NextSmallerElementToRight(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] NextSmallerElementToRight(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int n = arr.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);

        }

        return result;
    }
}
