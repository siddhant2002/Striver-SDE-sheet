package Day 26;

public class Partition_Equal_Subset_Sum 
{
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i:nums)
        {
            s+=i;
        }
        if(s%2==1)
        {
            return false;
        }
        boolean dp[][]=new boolean[nums.length][s/2+1];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<s/2+1;j++)
            {
                boolean nt=dp[i-1][j];
                boolean tk=false;
                if(j>=nums[i])
                {
                    tk=dp[i-1][j-nums[i]];
                }
                dp[i][j]=nt|tk;
            }
        }
        return dp[nums.length-1][s/2];
    }
}