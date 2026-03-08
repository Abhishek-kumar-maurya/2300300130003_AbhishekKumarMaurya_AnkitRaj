public class container_with_most_water {
    public static int maxArea(int[] heights) {
        int n = heights.length;
        int max_area=0;
        int i=0;
        int j=n-1;
        int width=0;
        // yha pr two pointer approach ek starting se and ek second last se 
        while(i<j){
            // yha pr hum dono pointer ke corresponding minimum height nikalenge kyuki area increase krna hai and container ki height can't increase 
            // isliye hum minimum height wali side ko aage bdhayenge and usko max width se multiply krenge 
            int min_height = Math.min(heights[i],heights[j]);
            width=j-i; // saare width calculate kr rhe hai 
            max_area = Math.max(max_area, min_height*width ); // saare area calculate krke max area nikal kr store kr rhe hai 
            
            // ye important hai kab increase krna hai i ko and kb decrease krna hai j ko 
            if(heights[i]<heights[j]){
                i++; // jab next height bdi hai to i ko aage 
            }
            else{
                j--; // jab next height choti hai to j ko piche
            }

        }
        
        return max_area;

        
    }
    
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(heights);
        System.out.println(result);
    }
}