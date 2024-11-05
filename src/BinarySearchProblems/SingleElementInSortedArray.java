package BinarySearchProblems;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int result = singleNonDuplicate(arr);
        System.out.println(result);
    }

    private static int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        int first = 1;
        int last = n - 2;

        if (n == 1) return nums[0];
        if (nums[first - 1] != nums[first]) return nums[first - 1];
        if (nums[last + 1] != nums[last]) return nums[last + 1];

        while (first <= last) {

            int midIndex = (first + last) / 2;

            if (nums[midIndex] != nums[midIndex - 1] && nums[midIndex] != nums[midIndex + 1]) return nums[midIndex];

            if (midIndex % 2 == 1 && nums[midIndex] == nums[midIndex - 1] ||
                    midIndex % 2 == 0 && nums[midIndex] == nums[midIndex + 1]){

                first=midIndex+1;

            }else {
                last=midIndex-1;
            }
        }

        return -1;
    }
}
