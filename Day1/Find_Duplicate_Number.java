class Solution {
    // public int findRepeatedNumber(int nums[], int s, int e){
    // //     if(s > e) return -1;
    // //     int mid = (s+e)/2;
    // //     // Base Case
    // //     if(nums[mid] == nums[mid+1]) return nums[mid];

    // //     return findRepeatedNumber(nums, mid,e);
    // // }
    public int findDuplicate(int[] nums) {
        
    //     Arrays.sort(nums);
    //     if(nums[0] == nums[1]) return nums[0];
    //     if(nums[nums.length-1] == nums[nums.length-2]) return nums[nums.length-1];
    //     int s = 0, e = nums.length-1;
    //     int mid = (s+e)/2;
    //     if(nums[mid] == nums[mid+1]) return nums[mid];
        
    //     // Helper Function
    //     int ans1 = findRepeatedNumber(nums,0,mid);
    //     if(ans1 != -1) return ans1;
    //     else{
    //         int ans2 = findRepeatedNumber(nums,mid+1, e);
    //         return ans2;
    //     }
    // }

    // HashSet<Integer> set = new HashSet<>();
    // for(int x : nums){
    //     if(set.contains(x)){
    //         return x;
    //     }
    //     set.add(x);
    // }
    // return 0;

    int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            // Count the numbers less than or equal to mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            // If count is greater than mid, the duplicate lies in the left half
            if (count > mid) {
                right = mid;
            } else { // Otherwise, it lies in the right half
                left = mid + 1;
            }
        }

        return left;
    }
}
