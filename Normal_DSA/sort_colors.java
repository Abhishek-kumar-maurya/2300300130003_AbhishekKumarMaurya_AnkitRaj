import java.util.Arrays;

public class sort_colors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        for(int i =0; i<n ; i++){
            for(int j=i+1;j<n ;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                
            }
        }

        System.out.println(Arrays.toString(nums));

        
    }
    public static void main(String[] args) {
        sort_colors sc = new sort_colors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sc.sortColors(nums);
    }
}

    
