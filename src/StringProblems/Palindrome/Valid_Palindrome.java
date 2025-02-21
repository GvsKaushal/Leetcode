package StringProblems.Palindrome;

public class Valid_Palindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {

        s = s.trim();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }


        return checkPalindrome(String.valueOf(stringBuilder));
    }

    private static boolean checkPalindrome(String s) {

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
