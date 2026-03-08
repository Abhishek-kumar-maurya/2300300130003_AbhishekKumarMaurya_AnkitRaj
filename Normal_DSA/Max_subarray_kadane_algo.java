public class Max_subarray_kadane_algo {

    public static int Max_subarray(int[] nums){

        int current_sum = nums[0];
        int max_sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }
    public static void main(String[] args){
        Max_subarray_kadane_algo obj = new Max_subarray_kadane_algo();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = obj.Max_subarray(nums);
        System.out.println(result);
    }
}

    