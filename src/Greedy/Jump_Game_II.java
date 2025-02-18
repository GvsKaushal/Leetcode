package Greedy;

public class Jump_Game_II {

    public static void main(String[] args) {

        int[] array = {2, 3, 0, 1, 4};

        System.out.println(canJump(array));

    }

    public static int canJump(int[] nums) {

        int len = nums.length;

        if (len <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < len - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= len - 1) break;
            }
        }

        return jumps;
    }
}
