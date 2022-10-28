package Day 1;
import java.util.*;
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int s=0,p=Integer.MIN_VALUE;
        for(int i:nums)
        {
            s+=i;
            p=Math.max(p,s);
            if(s<0)
            {
                s=0;
            }
        }
        return p;
    }
}