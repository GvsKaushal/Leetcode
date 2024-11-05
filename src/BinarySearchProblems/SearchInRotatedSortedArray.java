package BinarySearchProblems;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int val = 0;

        int result = search(arr, val);
        System.out.println(result);
    }

    private static int search(int[] nums, int target) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;

            if (nums[midIndex] == target) return midIndex;

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

        return -1;


    }
}
