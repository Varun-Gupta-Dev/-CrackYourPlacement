class Solution {
    public int merge(int nums[], int si, int ei, int mid){
        int i = si;
        int j = mid+1;
        int temp[] = new int[ei-si+1];
        int k=0;
        int ans = 0;
        for(i = si; i<=mid; i++){
            while(j<=ei && (long)nums[i] > (long)2*nums[j]){
                j++;

            }
            ans += (j-(mid+1));
        }
         i= si;
        j = mid+1;
        while(i<=mid && j<=ei){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=ei){
            temp[k++] = nums[j++];
        }

        for( k=0, i=si; k<temp.length; k++,i++){
            nums[i] = temp[k];
        }
        return ans;
    }

    public int mergeSort(int nums[], int si, int ei){
        if(si >= ei){
            return 0;
        }
        int mid = (si+ei)/2;
        int ans = mergeSort(nums,si,mid);
        ans += mergeSort(nums, mid+1,ei);
        ans += merge(nums,si,ei, mid);
        return ans;
    }
    public int reversePairs(int[] nums) {
        // Brute force
        // Time limit exceeds
        // int ans = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if((long)nums[i] > (long)2*nums[j]){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;  

        return mergeSort(nums,0,nums.length-1);
    }
}