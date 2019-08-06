/**
 * 买入股票的最佳时机
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[index]) {
                index = i;
            }
            if (prices[i] - prices[index] > profit) {
                profit = prices[i] - prices[index];
            }
        }
        return profit;
    }
}
