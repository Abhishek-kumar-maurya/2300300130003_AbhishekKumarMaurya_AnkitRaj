class Solution {
    private int rob(int[] nums, int index ,int[] dp){
            
            if(index<0) return 0;
           
            if(dp[index] != -1){
                        return dp[index];
                    }
            int take = nums[index] + rob(nums,index-2,dp);
            int skip = rob(nums, index-1,dp);
            dp[index] = Math.max(take , skip);
            return dp[index];
        }
    public int rob(int[] nums) {
        int[]dp =new int[nums.length+1];
        for(int i =0; i<nums.length; i++){
            dp[i]=-1;
        }
        return rob(nums, nums.length - 1, dp);  
    }
}