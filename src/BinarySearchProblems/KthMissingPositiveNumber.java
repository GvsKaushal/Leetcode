package BinarySearchProblems;

public class KthMissingPositiveNumber {

    public static void main(String[] args) {

        int[] arr = {2};
        int k = 1;

        int result = findKthPositive(arr, k);
        System.out.println(result);

    }

    private static int findKthPositive(int[] arr, int k) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;


        while (left <= right) {

            int midIndex = (left + right) / 2;

            int missing = arr[midIndex] - (midIndex + 1);

            if (missing < k) {

                left = midIndex + 1;

            } else {
                right = midIndex - 1;
            }
        }

        int result = left + k;

        return result;
    }
}
