package BinarySearchProblems;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int result = singleNonDuplicate(arr);
        System.out.println(result);
    }

    private static int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        int left = 1;
        int right = n - 2;

        if (n == 1) return nums[0];
        if (nums[left - 1] != nums[left]) return nums[left - 1];
        if (nums[right + 1] != nums[right]) return nums[right + 1];

        while (left <= right) {

            int midIndex = (left + right) / 2;

            if (nums[midIndex] != nums[midIndex - 1] && nums[midIndex] != nums[midIndex + 1]) return nums[midIndex];

            if (midIndex % 2 == 1 && nums[midIndex] == nums[midIndex - 1] ||
                    midIndex % 2 == 0 && nums[midIndex] == nums[midIndex + 1]){

                left=midIndex+1;

            }else {
                right=midIndex-1;
            }
        }

        return -1;
    }
}
