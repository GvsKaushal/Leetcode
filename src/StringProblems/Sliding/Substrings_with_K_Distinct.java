package StringProblems.Sliding;

import java.util.Arrays;

public class Substrings_with_K_Distinct {
    public static void main(String[] args) {
        String str = "aba";
        int k = 2;
        System.out.println(countSubstr(str, k));
    }

    public static int countSubstr(String s, int k) {
        int length = s.length();

        int count = 0;
        boolean[] arr = new boolean[26];

        for (int i = 0; i < length; i++) {

            int temp = 0;
            Arrays.fill(arr, false);

            for (int j = i; j < length; j++) {

                if (!arr[s.charAt(j) - 'a']) {
                    temp++;
                }

                arr[s.charAt(j) - 'a'] = true;

                if (temp == k) {
                    count++;
                }
            }
        }
        return count;
    }


}
