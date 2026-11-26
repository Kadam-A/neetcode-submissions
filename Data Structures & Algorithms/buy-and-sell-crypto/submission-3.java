class Solution {
    public int maxProfit(int[] prices) {

        int l = 0, r = l+1;
        int maxProfit = 0;
        if (prices.length == 1) return 0;
        
        while (l < r && r < prices.length) {
            maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            // new lowest value
            if (prices[r] < prices[l]) {
                l = r;
            }
            r++;
            
            
        }
        return maxProfit;
    }
}
