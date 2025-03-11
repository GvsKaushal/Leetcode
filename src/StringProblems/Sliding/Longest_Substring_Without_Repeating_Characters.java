package StringProblems.Sliding;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = " ";

        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {

        int len = s.length();

        int longestSubstring = 0;
        int left = 0;
        boolean[] arr = new boolean[128];

        for (int right = 0; right < len; right++) {

            while (arr[(int)s.charAt(right)] == true) {
                arr[(int)s.charAt(left)] = false;
                left++;
            }

            arr[(int)s.charAt(right)] = true;
            longestSubstring = Math.max(longestSubstring, (right - left + 1));

        }

        return longestSubstring;
    }
}
