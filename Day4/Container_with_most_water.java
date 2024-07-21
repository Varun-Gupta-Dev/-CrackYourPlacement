class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
    //     int maxWater = 0;
    //     int lp = 0;
    //     int rp = n-1;
    //     while(lp < rp){
    //         int ht = Math.min(height[lp],height[rp]);
    //         int width = rp - lp;
    //         int currWater = ht*width;
    //         maxWater = Math.max(maxWater,currWater);

    //         if(height[lp] < height[rp]){
    //             lp++;
    //         }else{
    //             rp--;
    //         }

    //     }
    //     return maxWater;

    
       int lp = 0;
       int rp = n-1;
       int maxWater = 0;
       int ht, width,currWater;
       while(lp<rp){
            ht = Math.min(height[lp],height[rp]);
            width = rp-lp;
            currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }

       }
       return maxWater;
            
    }
}
