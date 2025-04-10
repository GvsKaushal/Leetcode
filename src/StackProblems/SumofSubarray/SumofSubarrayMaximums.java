package StackProblems.SumofSubarray;

// decreasing stack

import java.util.Stack;

public class SumofSubarrayMaximums {

    public static void main(String[] args) {

        int[] array = {3, 2, 1};
        int result = sumSubarrayMaxs(array);
        System.out.println(result);
    }

    private static int sumSubarrayMaxs(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        long total = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i <= arr.length; i++) {
            while (!stack.empty() && (i == arr.length || arr[i] >= arr[stack.peek()])) {

                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                total += (long) (mid - left) * (right - mid) * arr[mid];

            }
            stack.push(i);
        }

        total = total % mod;

        return (int) total;
    }

}
