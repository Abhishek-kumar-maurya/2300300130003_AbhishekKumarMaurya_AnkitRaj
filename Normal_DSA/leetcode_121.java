
public class leetcode_121{
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min_price = prices[0];
        for(int i = 0; i<n ; i++){
            min_price = Math.min(min_price,prices[i]);
            profit = Math.max(profit, prices[i]-min_price);
            
        }
        return profit;
    }
    public static void main(String[] args) {
        
        leetcode_121 obj = new leetcode_121();
        int[] prices={3,2,1,8,9,4};
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }
}