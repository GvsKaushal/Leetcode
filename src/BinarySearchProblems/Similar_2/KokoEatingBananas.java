package BinarySearchProblems.Similar_2;

// FindTheSmallestDivisorGivenAThreshold same

import java.util.Arrays;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] arr = {3, 6, 7, 11};
        int h = 8;

        int minimumBananas = minEatingSpeed(arr, h);
        System.out.println("Minimuum number of bananas per hour = " + minimumBananas);
    }

    private static int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = 0;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int Tt = TotalTime(piles, midIndex);

            if (Tt >= 0 && Tt <= h) {
                ans = midIndex;
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        return ans;
    }

    private static int TotalTime(int[] piles, int m) {

        int TotalTime = 0;

        for (int pile : piles) {
            TotalTime = TotalTime + (pile + m - 1) / m;
        }

        return TotalTime;
    }
}
