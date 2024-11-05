package BinarySearchProblems;

// https://www.youtube.com/watch?v=w2G2W8l__pc


public class SearchInRotatedSortedArrayII {

    public static void main(String[] args) {

        int[] arr = {1,0,1,1,1};
        int val = 0;

        boolean result = search(arr, val);
        System.out.println(result);
    }

    private static boolean search(int[] nums, int target) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;

            if (nums[midIndex] == target) return true;

            if (nums[left] == nums[midIndex] && nums[midIndex] == nums[right]) {
                left = left + 1;
                right = right - 1;
                continue;
            }

            if (nums[left] <= nums[midIndex]) {
                if (nums[left] <= target && target <= nums[midIndex]) {
                    right = midIndex - 1;
                } else {
                    left = midIndex + 1;
                }
            } else {
                if (nums[midIndex] <= target && target <= nums[right]) {
                    left = midIndex + 1;
                } else {
                    right = midIndex - 1;
                }
            }
        }

        return false;
    }
}
