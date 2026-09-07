class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice<=prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }
            else if(prices[i]<buyPrice){
                buyPrice = Math.min(buyPrice , prices[i]);
            }
            else{
                return 0;
            }
        }
        return maxProfit;
        
    }
}