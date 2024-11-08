package BinarySearchProblems.SearchInRotatedSortedArray;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int result = findMin(arr);
        System.out.println(result);
    }

    private static int findMin(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        int ans = Integer.MAX_VALUE;

        while (left <= right) {

            int midIndex = (left + right) / 2;

//       Edge case (<=)
            if (nums[left] <= nums[midIndex]) {
                ans = Math.min(ans,nums[left]);
                left = midIndex + 1;
            } else {
                ans = Math.min(ans,nums[midIndex]);
                right = midIndex - 1;
            }

        }

        return ans;
    }
}
