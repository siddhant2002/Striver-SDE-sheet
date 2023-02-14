package Day 7;

class Max_Consecutive_Ones 
{
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                m++;
            }
            else
            {
                p=Math.max(p,m);
                m=0;
            }
        }
        p=Math.max(p,m);
        return p;
    }
}