package StringProblems.Sliding;

import java.util.HashMap;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {

    public static void main(String[] args) {

        String s = "aaabbccd";
        int k = 2;

        System.out.println(lengthOfLongestSubstringKDistinct(s, k));
    }

    private static int lengthOfLongestSubstringKDistinct(String s, int k) {

        int len = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int longestSubstring = 0;

        int left = 0;

        for (int right = 0; right < len; right++) {
            hashMap.put(s.charAt(right), hashMap.getOrDefault(s.charAt(right), 0) + 1);

            while (hashMap.size() > k) {
                hashMap.put(s.charAt(left), hashMap.get(s.charAt(left)) - 1);
                if (hashMap.get(s.charAt(left)) == 0) {
                    hashMap.remove(s.charAt(left));
                }
                left++;
            }

            longestSubstring = Math.max(longestSubstring, (right - left + 1));

        }

        return longestSubstring;

    }
}
