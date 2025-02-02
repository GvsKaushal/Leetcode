package ArrayProblems;

// https://www.youtube.com/watch?v=Uj3gJjg6SXc

public class Container_With_MostWater {
    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int max_area = maxArea(height);

        System.out.println(max_area);
    }

    public static int maxArea(int[] height) {

        int len = height.length;

        int left = 0;
        int right = len - 1;
        int MaxArea = Integer.MIN_VALUE;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            MaxArea = Math.max(MaxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return MaxArea;
    }
}
