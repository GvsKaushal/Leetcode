package StringProblems;

public class RotateString {

    public static void main(String[] args) {

        String str = "abcde";
        String goal = "cdeab";
        boolean rotateString = rotateString(str, goal);
        System.out.println(rotateString);
    }

    private static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String string = s + s;

        int i = string.indexOf(goal);
        if (i != -1) {
            return true;
        }

        return false;
    }
}
