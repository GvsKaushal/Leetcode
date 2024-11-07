package BinarySearchProblems;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String[] args) {

        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int result = shipWithinDays(weights, days);
        System.out.println(result);

    }

    private static int shipWithinDays(int[] weights, int days) {

        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        int ans = -1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int Noofdays = getDays(weights, midIndex);

            if (Noofdays <= days) {
                ans = midIndex;
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        return ans;
    }

    private static int getDays(int[] weights, int capacity) {

        int days = 0;
        int cap = capacity;

        int i = 0;
        int n = weights.length;

        while (i < n) {

            if (cap - weights[i] >= 0) {
                cap = cap - weights[i];
                if (cap == 0 || i == n - 1) {
                    days++;
                    cap = capacity;
                }
                i++;
            } else {
                days++;
                cap = capacity;
            }
        }
        return days;
    }
}