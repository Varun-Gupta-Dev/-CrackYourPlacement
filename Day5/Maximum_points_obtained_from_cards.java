class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // Not optimised 

        int n = cardPoints.length;
        // int windowSum=0;
        // int ans = 0;
        // int tot_sum = 0;
        // for(int i=0; i<n; i++){
        //     tot_sum += cardPoints[i];
        // }
        // for(int i=0, j=n-k-1; j<n; i++,j++){
        //     windowSum = 0;
        //     for(int l=i; l<=j; l++){
        //          windowSum += cardPoints[l];
        //     }
        //     ans = Math.max(ans,tot_sum - windowSum);
        // }
        // return ans;

        // Optimised code(Sliding window)

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        if(k == n) return sum;

        int start = k;
        int end = n-1;
        int ans = sum;
        while(start>0){
            sum -= cardPoints[--start];
            sum += cardPoints[end--];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}