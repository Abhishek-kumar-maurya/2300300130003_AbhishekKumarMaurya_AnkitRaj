
import java.util.Arrays;

public class k_largest {
    public static int kthlargest(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        return n-k; 
    }
}
