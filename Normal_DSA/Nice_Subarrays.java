class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        int i=0,j=0,cur_sum=0,count=0,zero_count=0;
        
        while(j<n){
            cur_sum+=nums[j];
            while(i<j && (nums[i]==0 || cur_sum>k)){
                if(nums[i]==0){
                    zero_count+=1;
                }
                else{
                    zero_count=0;
                }
                cur_sum-=nums[i];
                i++;
            }
                if(cur_sum == k){
                    count += 1+zero_count;
                
            }
            j++;
        }
        return count;
    }
}