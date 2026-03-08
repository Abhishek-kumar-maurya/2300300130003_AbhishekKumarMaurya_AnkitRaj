import java.util.Arrays;
public class second_highest{
    public int[] secondhigh(int[] nums){
        int first=-9999;
        int second=-9999;
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            if(nums[i]>first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second && nums[i]<first){
                second=nums[i];
            }
            
        }
        return new int[]{second,};
        
    }
    public static void main(String[] args) {
        second_highest obj = new second_highest();
        int[] nums={6,9,7,7,2,2,4};
        int[] result = obj.secondhigh(nums);
        System.out.println(Arrays.toString(result));

    }
}