/**
 * 买入股票的最佳时机II
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int profits = 0;
        int index = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[index]) {
                index = i;
            }
            if (i == prices.length - 1) {
                if (prices[i] - prices[index] > 0) {
                    profits += prices[i] - prices[index];
                }
            } else {
                if (prices[i] > prices[i + 1]) {
                    profits += prices[i] - prices[index];
                    index = i + 1;
                }
            }
        }
        return profits;
    }
}
