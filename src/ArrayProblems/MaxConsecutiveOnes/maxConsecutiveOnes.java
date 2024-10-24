package ArrayProblems.MaxConsecutiveOnes;

public class maxConsecutiveOnes {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 1, 1, 1};

        System.out.println("max Consecutive Ones = " + findMaxConsecutiveOnes(array));

    }

    private static int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int Maxcount = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if (Maxcount < count) {
                Maxcount = count;
            }
        }

        return Maxcount;
    }
}
