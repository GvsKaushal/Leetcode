package Greedy;

public class Lemonade_Change {

    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};

        System.out.println(lemonadeChange(bills));
    }

    private static boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;
        int twenty = 0;

        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                if (five <= 0) return false;
                five--;
                ten++;
            } else if (i == 20) {
                if (five >= 1 && ten >= 1) {
                    five--;
                    ten--;
                    twenty++;
                } else if (five >= 3) {
                    five = five - 3;
                    twenty++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
