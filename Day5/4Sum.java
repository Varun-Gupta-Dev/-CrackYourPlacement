class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums==null || nums.length<4){
            return new ArrayList<>();
        }
        int n = nums.length; 
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){

            for(int j=i+1; j<nums.length-2; j++){

            int left = j+1;
            int right = nums.length-1;
            while(left<right){
                long sum = (long)nums[i]+ nums[j] + nums[left]+ nums[right];
                if(sum == target){

                    // Add the numbers to result set, it will store unique values
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                }else if( sum <target){
                    left++;
                }else{
                    right--;
                }
            }
            }
        }
        return new ArrayList<>(result);
    }
}