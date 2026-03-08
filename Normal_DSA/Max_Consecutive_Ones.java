class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,n=nums.length,curr_sum=0,zero=0;
        for(int a=0; a<n; a++){
                if (nums[a]==0){
                    zero++;
                }
            }
            if (zero<k){
                return n;
            }
        while(j<n){
            
            curr_sum+=nums[j];
            if(j-i+1 - curr_sum >k){
                curr_sum -= nums[i];
                i++;
            }
            else if(j-i+1 - curr_sum == k){
                ans=Math.max(ans,j-i+1);
                
            }
            
            j++;

        }
        return ans;
    }
}