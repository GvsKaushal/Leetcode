package BinarySearchProblems.Similar_1;

public class FindPeakElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    private static int findPeakElement(int[] nums) {

        int n = nums.length;

        if (n==1) return 0;

        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int left = 1;
        int right = n - 2;

        while (left <= right) {

            int midIndex = (left + right) / 2;

            if (nums[midIndex] > nums[midIndex - 1] && nums[midIndex] > nums[midIndex + 1]) return midIndex;

            if (nums[midIndex - 1] < nums[midIndex] && nums[midIndex] < nums[midIndex + 1]) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return -1;
    }
}
