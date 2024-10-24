package ArrayProblems.SingleNumber;

public class singleNumber {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        int result = findSingleNumber(arr);
        System.out.println(result);

    }

    private static int findSingleNumber(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            int result = nums[0];
            return result;
        }

        int XOR = 0;

        for (int x : nums) {
            XOR = XOR ^ x;
        }

        return XOR;

    }
}
