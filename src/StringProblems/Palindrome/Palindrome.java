package StringProblems.Palindrome;

public class Palindrome {

    public static void main(String[] args) {

        String str = "abaaba";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String s) {

        int n = s.length();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
