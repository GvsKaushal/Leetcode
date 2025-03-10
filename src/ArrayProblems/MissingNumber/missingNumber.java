package ArrayProblems.MissingNumber;

public class missingNumber {

    public static void main(String[] args) {

        int[] array={0,1,3,2,5};

        System.out.println("Missing Number = "+findMissingNumber(array));

    }

    private static int findMissingNumber(int[] nums) {

        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        return total - sum;
    }

}
