package Day 25;

import java.util.Arrays;



public class Knapsack_Problem 
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    {
        int dp[][]=new int[n][W+1];
        for(int k[]:dp)
        {
            Arrays.fill(k,-1);
        }
        return task(wt,val,W,n-1,dp);
    }
    static int task(int wt[], int val[], int w, int n, int dp[][])
    {
        if(n==0)
        {
            if(wt[n]<=w)
            {
                return val[n];
            }
            else
            {
                return 0;
            }
        }
        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        int nt = task(wt,val,w,n-1,dp);
        int fk = Integer.MIN_VALUE;
        if(wt[n]<=w)
        {
            
            fk = val[n]+task(wt,val,w-wt[n],n-1,dp);
        }
        return dp[n][w] = Math.max(nt,fk);
    }
}