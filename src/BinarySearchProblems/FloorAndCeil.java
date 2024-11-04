package BinarySearchProblems;

import java.util.Arrays;

public class FloorAndCeil {

    public static void main(String[] args) {

        int[] arr = {5, 6, 8, 8, 6, 5, 5, 6};
        int val = 10;

        int[] result = getFloorAndCeil(val, arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getFloorAndCeil(int x, int[] arr) {

        Arrays.sort(arr);

        int[] result = {-1, -1};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if (mid <= x) {
                result[0] = mid;
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int midIndex = (l + r) / 2;
            int mid = arr[midIndex];

            if (mid >= x) {
                result[1] = mid;
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }

        return result;
    }
}
