package ArrayProblems.MajorityElement;

// https://www.youtube.com/watch?v=gY-I8uQrCkk


public class majorityElement {
    public static void main(String[] args) {

        int[] nums = {3,3,4};

        int result = findMajorityElement(nums);
        System.out.println("Majority Element = " + result);
    }

    private static int findMajorityElement(int[] nums) {

        int n = nums.length;

        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (count == 0) {
                majority = nums[i];
            }

            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }

        }

        return majority;

    }
}
