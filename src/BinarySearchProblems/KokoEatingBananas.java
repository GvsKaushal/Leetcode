package BinarySearchProblems;

import java.util.Arrays;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] arr = {805306368, 805306368, 805306368};
        int h = 1000000000;

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

        for (int i = 0; i < piles.length; i++) {

            double z = Math.ceil((double) piles[i] / (double) m);
            TotalTime = TotalTime + (int) z;
        }

        return TotalTime;
    }
}
