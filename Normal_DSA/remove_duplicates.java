import java.util.Arrays;
public class remove_duplicates{
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left=0;
        for(int i = 0; i<n; i++){
              
            if(nums[i]!=nums[left]){
                nums[++left]=nums[i];
            }
            
        }
        for(int right=left+1; right < n ; right++){
            nums[right] -= nums[right];
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
        
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,2,2,3,3,3,8,8};
        remove_duplicates obj = new remove_duplicates();
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
    }
}
