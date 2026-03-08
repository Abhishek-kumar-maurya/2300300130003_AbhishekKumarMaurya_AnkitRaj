class Solution {
    
    public static int Solve(int W , int[] val , int[] wt, int i , int[][] dp)
    {
        if(W == 0 || i == val.length) return 0 ;
        
        if(dp[i][W] != -1) return dp[i][W] ;
        
        int take = 0 ;
        if(wt[i] <= W)
        {
            take = val[i] + Solve(W-wt[i],val,wt,i+1 , dp) ;
        }
        
        int notTake = Solve(W,val,wt,i+1,dp) ;
        
        dp[i][W] = Math.max(take,notTake) ;
        return dp[i][W] ;
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length ;
        int[][] dp = new int[n][W+1] ; // 0 i --> n-1 , j --> 8
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= W ; j++)
            {
                dp[i][j] = -1 ;
            }
        }
        return Solve(W,val,wt,0,dp) ;
    }
}