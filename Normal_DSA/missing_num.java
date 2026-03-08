class missing_num{
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int range_sum=0;
        int arr_sum=0;
        int missing_num = 0;
        for(int i = 0 ;i>=0 && i<=n ; i++){
            range_sum = range_sum + i;
        }
        for(int i = 0 ; i<n ; i++){
            arr_sum = arr_sum + nums[i];
        }
        missing_num = range_sum-arr_sum;
        return missing_num;
        
    }
    public static void main(String[] args){
        missing_num obj = new missing_num();
        int[] nums = {1,4,2,0,5};
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}