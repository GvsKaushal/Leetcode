package BinarySearchProblems;

// m * k > bloomDay.length
// Bouquets=Bouquets+(count/k)

// https://www.youtube.com/watch?v=TXAuxeYBTdg

import java.util.Arrays;

public class MinimumNumberofDaystoMakemBouquets {

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,12,7,7};
        int bouquets = 2;
        int flowers = 3;

        int MinimumDays = minDays(arr, bouquets, flowers);
        System.out.println(MinimumDays);
    }

    private static int minDays(int[] bloomDay, int m, int k) {

        if (m * k > bloomDay.length) return -1;

        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();

        int ans = -1;

        while (left <= right) {

            int midIndex = (left + right) / 2;

            int NoofBouquets = getBouquetsAtGivenDay(bloomDay, midIndex, k);

            if (NoofBouquets >= m) {
                ans = midIndex;
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }

        }
        return ans;
    }

    private static int getBouquetsAtGivenDay(int[] arr, int day, int k) {

        int count = 0;
        int Bouquets = 0;

        for (int i : arr) {

            if (day >= i) {
                count++;
            }else {
                count=0;
            }

            if (count == k) {
                Bouquets++;
                count = 0;
            }
        }

        return Bouquets;
    }
}
