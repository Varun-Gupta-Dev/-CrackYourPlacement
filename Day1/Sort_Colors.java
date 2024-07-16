class Solution {
    public void sortColors(int[] nums) {
        int k=0;
        int helper;
        for(int i=0; i<nums.length; i++){
            
                if(nums[i] == 0){
                    //swap
                    helper = nums[i];
                    nums[i] = nums[k];
                    nums[k] = helper;
                    k++;

                }
            
        }
        
        for(int i=k; i<nums.length; i++){
            
                if(nums[i] == 1){
                    // swap
                    helper = nums[i];
                    nums[i] = nums[k];
                    nums[k] = helper;
                    k++;
                }
            
        }
    }
}
