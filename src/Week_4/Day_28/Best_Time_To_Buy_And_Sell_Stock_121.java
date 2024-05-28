package Week_4.Day_28;

public class Best_Time_To_Buy_And_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0], maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
