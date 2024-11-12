package BinarySearchProblems.AggressiveCows;

// error

import java.util.Arrays;

public class aggressiveCows {

    public static void main(String[] args) {

        int[] stalls = {10, 1, 2, 7, 5};
        int cows = 4;

        int result = aggressive_Cows(stalls, cows);
        System.out.println(result);
    }

    private static int aggressive_Cows(int[] stalls, int k) {
        
        Arrays.sort(stalls);
        if (stalls.length < k) return -1;

        int left = 1;
        int right = Arrays.stream(stalls).max().getAsInt();

        int ans = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (placeCows(stalls, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static boolean placeCows(int[] stalls, int min_distance) {

        int cows_count = 1;
        int last_cow = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - last_cow >= min_distance) {
                cows_count++;
                last_cow = stalls[i];
            }

        }

        if (cows_count >= 4) {
            return true;
        } else {
            return false;
        }
    }
}
