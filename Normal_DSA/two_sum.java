import java.util.Arrays;

public class two_sum{
    public int[] twosum(int[] nums , int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,4,3,7};
        int target = 9;
        two_sum obj = new two_sum();
        int[] result = obj.twosum(nums, target);
        
        System.out.println(Arrays.toString(result));
        
    }
}