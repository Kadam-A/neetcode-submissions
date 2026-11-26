class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;
        int buyPrice = prices[l];
        while (l < r && r < prices.length) {
            
            int profit = prices[r] - prices[l]; 
            maxProfit = Math.max(maxProfit, profit);

            if (prices[r] < prices[l]) {
                l = r;
                r++;
            } else {
                r++;
            }

            

        }
        return maxProfit;
    }
}
