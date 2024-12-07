package StackProblems.NextGreater;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerToLeft {

    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 10, 8};

        int[] result = NextSmallerElementToLeft(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] NextSmallerElementToLeft(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[arr.length];

        int n2 = arr.length;

        for (int i = 0; i < n2; i++) {

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
