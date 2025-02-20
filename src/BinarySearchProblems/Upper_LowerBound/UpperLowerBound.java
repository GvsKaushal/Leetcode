package BinarySearchProblems.Upper_LowerBound;

public class UpperLowerBound {

    // Lower Bound: First index where arr[i] >= x
    public static int lowerBound(int[] arr, int x) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid - 1; // Move left
            } else {
                low = mid + 1; // Move right
            }
        }

        return low;
    }

    // Upper Bound: First index where arr[i] > x
    public static int upperBound(int[] arr, int x) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                high = mid - 1; // Move left
            } else {
                low = mid + 1; // Move right
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5, 6, 8, 10};
        int x = 4;

        int lower = lowerBound(arr, x);
        int upper = upperBound(arr, x);

        System.out.println("Lower Bound Index: " + lower);
        System.out.println("Upper Bound Index: " + upper);
    }
}
