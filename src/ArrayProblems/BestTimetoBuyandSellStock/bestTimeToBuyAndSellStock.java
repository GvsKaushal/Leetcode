package ArrayProblems.BestTimetoBuyandSellStock;

public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] array = {7, 1, 5, 3, 6, 4};
        int result = findBestTime(array);
        System.out.println(result);

    }

    private static int findBestTime(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i]-minPrice>maxProfit) {
                maxProfit=prices[i]-minPrice;
            }
        }

        return maxProfit;
    }
}
