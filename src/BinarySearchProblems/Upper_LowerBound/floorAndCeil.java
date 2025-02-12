package BinarySearchProblems.Upper_LowerBound;

//Definition:
//        Floor of a number x: The largest number in the array that is ≤ x.
//        Ceil of a number x: The smallest number in the array that is ≥ x.

public class floorAndCeil {

    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int val = 8;

        int ceil = getCeilIndex(arr, val);
        int floor = getFloorIndex(arr, val);

        System.out.println(ceil + " " + floor);
    }

    private static int getCeilIndex(int[] nums, int target) {

        int ans = -1;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int midIndex = (l + r) / 2;
            int mid = nums[midIndex];

            if (mid >= target) {
                ans = midIndex;
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }

        return ans;
    }

    private static int getFloorIndex(int[] nums, int target) {

        int ans = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int mid = nums[midIndex];

            if (mid <= target) {
                ans = midIndex;
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return ans;
    }
}
