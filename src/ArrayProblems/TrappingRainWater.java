package ArrayProblems;

// https://www.youtube.com/watch?v=EdR3V5DBgyo

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(array);
        System.out.println(result);

    }

    private static int trap(int[] height) {

        int len = height.length;

        int left = 0;
        int right = len - 1;

        int water = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {

            if (height[left] <= height[right]) {

                leftMax = Math.max(height[left], leftMax);
                water = water + (leftMax - height[left]);
                left++;

            } else {

                rightMax = Math.max(height[right], rightMax);
                water = water + (rightMax - height[right]);
                right--;

            }
        }

        return water;
    }
}
