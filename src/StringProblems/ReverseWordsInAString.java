package StringProblems;


public class ReverseWordsInAString {

    public static void main(String[] args) {

        String str = "     the    sky        is     blue         ";
        String reverseWord = reverseWords(str);
        System.out.println(reverseWord);
    }

    private static String reverseWords(String s) {


        String[] words = s.split("\\s");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            if (!words[i].isBlank()) {
                stringBuilder.append(words[i]);
                stringBuilder.append(" ");
            }
        }
        String reversedString = stringBuilder.substring(0, stringBuilder.length() - 1);

        return reversedString;
    }
}
