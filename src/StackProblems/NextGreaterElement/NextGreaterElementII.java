package StackProblems.NextGreaterElement;

// duplicates --> no hashmap

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

    public static void main(String[] args) {

        int[] num = {100, 1, 11, 1, 120, 111, 123, 1, -1, -100};

        int[] result = nextGreaterElements(num);
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int len = nums.length;
        int[] result = new int[len];

        for (int i = (2 * len) - 1; i >= 0; i--) {

            if (i < len) {

                while (!stack.isEmpty() && nums[i] >= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
                stack.push(nums[i]);

            } else {

                while (!stack.isEmpty() && nums[i % len] > stack.peek()) {
                    stack.pop();
                }

                stack.push(nums[i % len]);

            }
        }

        return result;
    }

}
