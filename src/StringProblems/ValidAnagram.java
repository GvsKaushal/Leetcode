package StringProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";
        boolean isIsomorphic = isAnagram(str1, str2);
        System.out.println(isIsomorphic);
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
            arr2[t.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }

        return false;
    }
}
