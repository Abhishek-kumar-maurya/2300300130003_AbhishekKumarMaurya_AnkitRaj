class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cur_sum=0;
        for (int i = 0; i<n ; i++){
            
            cur_sum+=nums[i];
            if(map.containsKey(cur_sum-k)){
                count+= map.get(cur_sum - k);
            }
            map.put(cur_sum,map.getOrDefault(cur_sum,0)+1);
        }
        return count;
    }
}