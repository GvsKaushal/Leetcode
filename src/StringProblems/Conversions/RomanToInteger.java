package StringProblems.Conversions;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        String str = "MCMXCIV";
        int romanToInt = romanToInt(str);
        System.out.println(romanToInt);
    }

    private static int romanToInt(String s) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1) {

                String substring=s.substring(i,i+2);

                if (hashMap.containsKey(substring)){
                    sum=sum+hashMap.get(substring);
                    i++;
                    continue;
                }

            }

            String substring=s.substring(i,i+1);

            if (hashMap.containsKey(substring)) {
                sum = sum + hashMap.get(substring);
            }
        }

        return sum;
    }
}





