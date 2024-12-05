package StackProblems.NextGreaterElement;

// no duplicates

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public static void main(String[] args) {

        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

        for (int i = n2 - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                hashMap.put(nums2[i], -1);
            } else {
                hashMap.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);

        }

        for (int i = 0; i < n1; i++) {
            nums1[i] = hashMap.get(nums1[i]);
        }

        return nums1;
    }
}
