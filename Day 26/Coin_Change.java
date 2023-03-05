package Day 26;

class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<=amount;i++)
        {
            if(i%coins[0]==0)
            {
                dp[0][i]=i/coins[0];
            }
            else
            {
                dp[0][i]=(int)(1e9);
            }
        }
        for(int i=1;i<coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                int nt=dp[i-1][j];
                int tk=(int)1e9;
                if(j>=coins[i])
                {
                    tk=1+dp[i][j-coins[i]];
                }
                dp[i][j] = Math.min(nt,tk);
            }
        }
        return dp[coins.length-1][amount]>=1000000000 ? -1 : dp[coins.length-1][amount];
    }
}

