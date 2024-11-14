package StringProblems;

// https://www.youtube.com/watch?v=ogTMIFPjNkQ

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String str1 = "foo";
        String str2 = "bar";
        boolean isIsomorphic = isIsomorphic(str1, str2);
        System.out.println(isIsomorphic);
    }

    private static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        boolean st=checkIsomorphic(s,t);
        boolean ts=checkIsomorphic(t,s);

        if (st && ts){
            return true;
        }

        return false;
    }

    private static boolean checkIsomorphic(String s, String t) {


        HashMap<Character, Character> hashMap = new HashMap<>();

        int first = 0;
        int second = 0;

        while (first < s.length()) {
            if (hashMap.containsKey(s.charAt(first))){
                if (hashMap.get(s.charAt(first))==t.charAt(second)){

                }else {
                    return false;
                }
            }
            hashMap.put(s.charAt(first), t.charAt(second));

            first++;
            second++;
        }

        return true;
    }
}
