public class running_sum_1d_array{
public int[] runningsum(int[] nums)
{
    for(int i=1;i<nums.length;i++){
        nums[i]=nums[i]+nums[i-1];
    }
    return nums;
}
public static void main(String[] args){
    running_sum_1d_array obj=new running_sum_1d_array();
    int[] nums = {1,1,1,1,1};
    int[] sum = obj.runningsum(nums);
    for(int i=0; i<nums.length ; i++){
        System.out.println(sum[i]);
    }
}
}
