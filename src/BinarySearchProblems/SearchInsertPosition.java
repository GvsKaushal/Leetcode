package BinarySearchProblems;

// Ceil

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int val = 5;

        int result = searchInsert(arr, val);
        System.out.println(result);
    }

    private static int searchInsert(int[] nums, int target) {

        int ans=nums.length;

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
}