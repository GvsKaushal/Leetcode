package StringProblems.Palindrome;

// https://www.youtube.com/watch?v=XYQecbcd6_c

public class LongestPalindromicSubstring {


    public static void main(String[] args) {

        String str = "babad";
        String longestPalindrome = longestPalindrome(str);
        System.out.println(longestPalindrome);
    }

    private static String longestPalindrome(String s) {

        StringBuilder longestPalindrome = new StringBuilder();

        int left;
        int right;

        int n = s.length();


        for (int i = 0; i < n; i++) {

            // odd length
            left = right = i;
            while ((left >= 0 && right < n) && s.charAt(left) == s.charAt(right)) {

                if ((right - left + 1) > longestPalindrome.length()) {
                    longestPalindrome.setLength(0);
                    longestPalindrome.append(s, left, right + 1);
                }

                left--;
                right++;
            }

            // even length
            left = i;
            right = i + 1;
            while ((left >= 0 && right < n) && s.charAt(left) == s.charAt(right)) {

                if ((right - left + 1) > longestPalindrome.length()) {
                    longestPalindrome.setLength(0);
                    longestPalindrome.append(s, left, right + 1);
                }

                left--;
                right++;
            }

        }

        return String.valueOf(longestPalindrome);
    }
}
