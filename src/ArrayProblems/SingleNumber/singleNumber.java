package ArrayProblems.SingleNumber;

public class singleNumber {
    public static void main(String[] args) {

        int[] arr = {4};
        int result = findSingleNumber(arr);
        System.out.println(result);

    }

    private static int findSingleNumber(int[] nums) {


        int XOR = 0;

        for (int x : nums) {
            XOR = XOR ^ x;
        }

        return XOR;

    }
}
