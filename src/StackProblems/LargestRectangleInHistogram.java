package StackProblems;

// increasing stack

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println(result);
    }

    private static int largestRectangleArea(int[] heights) {

        int area = 0;
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= len; i++) {

            while (!stack.isEmpty() && (i == len || heights[i] < heights[stack.peek()])) {

                int curr = stack.pop();
                int nse = i;
                int pse = stack.isEmpty() ? -1 : stack.peek();

                area = Math.max(area, (heights[curr] * (nse - pse - 1)));
            }
            stack.push(i);
        }

        return area;
    }
}
