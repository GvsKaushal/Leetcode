package Greedy;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {

        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";

        System.out.println(checkValidString(s));
    }

    private static boolean checkValidString(String s) {

        int low = 0;
        int high = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                low--;
                high--;
            } else if (s.charAt(i) == '*') {
                low--;
                high++;
            }

            if (high < 0) return false;

            if (low < 0) low = 0;
        }

        if (low == 0) {
            return true;
        }

        return false;
    }
}
