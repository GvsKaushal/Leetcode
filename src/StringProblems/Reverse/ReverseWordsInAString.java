package StringProblems.Reverse;


public class ReverseWordsInAString {

    public static void main(String[] args) {

        String str = "     the    sky        is     blue         ";
        String reverseWord = reverseWords(str);
        System.out.println(reverseWord);
    }

    private static String reverseWords(String s) {

        s = s.trim();
        s = s.replaceAll(" +", " ");

        String[] words = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            stringBuilder.append(words[i]);
            if (i!=0){
                stringBuilder.append(" ");
            }


        }

        return String.valueOf(stringBuilder);
    }
}
