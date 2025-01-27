package ArrayProblems.ArrayIsSortedandRotated;

public class checkIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        boolean result = check(arr);
        System.out.println(result);

    }

    private static boolean check(int[] nums) {

        int n = nums.length;

        boolean onlyOnce = false;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1] && onlyOnce == false) {
                int k = n - i;
                rotate(nums, k);
                onlyOnce = true;
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;

    }

    private static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        Reverse(nums, 0, n - 1);
        Reverse(nums, 0, k - 1);
        Reverse(nums, k, n - 1);
    }

    private static void Reverse(int[] arr, int first, int last) {

        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
