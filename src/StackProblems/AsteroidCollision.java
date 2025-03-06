package StackProblems;

// https://www.youtube.com/watch?v=_eYGqw_VDR4
// edge case check in code

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {

        int[] asteroids = {100, -2, -5};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }

    private static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();


        int len = asteroids.length;

        for (int i = 0; i < len; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                int modValue = -1 * asteroids[i];

                while (!stack.isEmpty() && stack.peek() > 0 && modValue > stack.peek()) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() > 0 && modValue == stack.peek()) {
                    stack.pop();
                    continue;
                }
                // Edge case check
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                }
            }
        }


        int[] result = new int[stack.size()];

        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }

        return result;
    }
}
