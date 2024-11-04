package BinarySearchProblems;

public class FloorInASortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 8};
        int val = 1;

        int result = findFloor(arr, val);
        System.out.println(result);
    }

    private static int findFloor(int[] arr, int k) {

        int ans = -1;

        int left = 0;
        int right = arr.length-1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if (mid <= k) {
                ans = midIndex;
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return ans;
    }
}
