package Day 7;

class Trapping_Rain_Water
{
    public int trap(int[] height) {
        int left=0,right=height.length-1,ans=0,min=0,max=0;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]>=min)
                {
                    min=height[left];
                }
                else
                {
                    ans+=(min-height[left]);
                }
                left++;
            }
            else
            {
                if(height[right]>=max)
                {
                    max=height[right];
                }
                else
                {
                    ans+=(max-height[right]);
                }
                right--;
            }
            //System.out.println(ans+" "+left);
        }
        return ans;
    }
}