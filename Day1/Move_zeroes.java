public class Solution {
    public void moveZeroes(int[] nums) {
       
       if(nums.length != 1){
            
        int j=0;
        for(int i=1; i<nums.length; i++){
                int idx = i;
                if(nums[i] != 0 && nums[j] == 0){

                    // Swap
                    nums[j] = nums[i];
                    nums[i] = 0;
                    j++;
                } if(nums[j] != 0) j++;
        }
       }
       
    }   
}