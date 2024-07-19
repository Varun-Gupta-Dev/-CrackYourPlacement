package Day2;

class Solution {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int profit=0;
        int buyPrice = Integer.MAX_VALUE;
        int mProfit = 0;
        for(int i=0; i<n; i++){
            if(prices[i] > buyPrice){
                profit = prices[i] - buyPrice;
                mProfit += profit;
                buyPrice = prices[i];
            }else{
                buyPrice = prices[i];
            }
        }
     return mProfit;   
    }
}
