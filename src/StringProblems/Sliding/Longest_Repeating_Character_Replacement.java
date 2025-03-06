package StringProblems.Sliding;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {

    public static void main(String[] args) {

        String s = "BAAA";
        int k = 0;

        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {

        int len = s.length();

        int left = 0;
        int max_fre = 0;
        int max_len = 0;

        int[] arr = new int[26];

        for (int right = 0; right < len; right++) {

            arr[s.charAt(right) - 'A']++;
            max_fre = Math.max(max_fre, arr[s.charAt(right) - 'A']);

            while ((right - left + 1) - max_fre > k) {
                arr[s.charAt(left) - 'A']--;
                max_fre = 0;
                for (int i : arr) {
                    max_fre = Math.max(max_fre, i);
                }
                left++;
            }

            if ((right - left + 1) - max_fre <= k) {
                max_len = Math.max(max_len, (right - left + 1));
            }
        }

        return max_len;
    }
}
