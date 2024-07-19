class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList();
        Set<Integer> keys = map.keySet();
        for(Integer k: keys){
            if(map.get(k)==2){
                list.add(k);
            }
        }
        return list;
    }
}