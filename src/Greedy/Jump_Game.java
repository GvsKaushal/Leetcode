package Greedy;

public class Jump_Game {
    public static void main(String[] args) {

        int[] array = {2, 3, 0, 1, 4};

        System.out.println(canJump(array));

    }

    public static boolean canJump(int[] nums) {

        int maxIndex = 0;

        if (nums.length == 1 && nums[0] == 0) return true;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0 && maxIndex <= i) break;

            int cur_Index = i + nums[i];

            if (cur_Index > maxIndex) {
                maxIndex = cur_Index;

            }

            if (maxIndex >= nums.length - 1) return true;
        }


        return false;
    }
}
