class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0,j=0,n=nums.length,max_element=-9999,count=0;
        int[] ans = new int[n-k+1];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        if(n==1 || k==1) return nums;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j-i+1 > k){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                
                i++;

            }
            if(j-i+1 == k){
                
                ans[count]= map.lastKey();
                count++;
            }
            j++;
        }
        return ans;

    }
}