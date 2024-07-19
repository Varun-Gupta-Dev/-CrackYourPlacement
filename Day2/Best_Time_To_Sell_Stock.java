package Day2;

class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            // sell stock
            if(prices[i]>buyPrice){
                mProfit = Math.max(mProfit, prices[i] - buyPrice);

            }
            else{
                // buy stock
                buyPrice = prices[i];
            }
        }
        return mProfit;

   
    }

    
}
