package StringProblems.Sliding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_of_Beauty_of_All_Substrings {

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }

    private static int beautySum(String s) {


        int len = s.length();

        int[] arr = new int[26];
        int count = 0;

        for (int i = 0; i < len; i++) {

            Arrays.fill(arr, 0);

            for (int j = i; j < len; j++) {

                arr[s.charAt(j) - 'a']++;

                int large = Integer.MIN_VALUE;
                int small = Integer.MAX_VALUE;

                for (int z : arr) {
                    if (z != 0) {
                        large = Math.max(large, z);
                        small = Math.min(small, z);
                    }
                }

                count = count + (large - small);

            }

        }

        return count;
    }

}
