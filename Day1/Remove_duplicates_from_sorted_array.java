import java.utils;
class Solution {
    public int removeDuplicates(int[] nums) {
    //    int j=1;
    //    for(int i=1; i<nums.length; i++){
    //        if(nums[i] != nums[i-1]){
    //            nums[j] = nums[i];
    //            j++;
    //        }
    //    }
    //    return j;
    // }

    ArrayList<Integer> ans  = new ArrayList<>();
    ans.add(nums[0]);
    for(int i=1; i<nums.length; i++){
        if(nums[i] != nums[i-1]){
            ans.add(nums[i]);
        }
    }
    int k = ans.size();
    for(int i=0; i<k; i++){
        nums[i] = ans.get(i);
    }
    return k;
}
}
