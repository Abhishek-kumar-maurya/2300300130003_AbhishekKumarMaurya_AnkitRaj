import java.util.Arrays;
public class Move_zeros{
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int non_zero=0;
        for(int i = 0; i<n; i++){
            if(nums[i]!=0){
                nums[non_zero]=nums[i];
                non_zero++;
            }
            
          }
        while(non_zero<n){
                nums[non_zero]=0;
                non_zero++;
        }
        System.out.println(Arrays.toString(nums));  
        
    }
    public static void main(String[] args){
        int[] nums = {3,0,5,2,0,0,4,3};
        Move_zeros obj = new Move_zeros();
        obj.moveZeroes(nums);
    }
}
