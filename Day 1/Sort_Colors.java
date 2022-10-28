package Day 1;
import java.util.*;
public class Sort_Colors {
    public void sortColors(int[] nums) {
        int i=0,m=0,j=nums.length-1;
        while(m<=j)
        {
            if(nums[m]==0)
            {
                int d=nums[i];
                nums[i]=nums[m];
                nums[m]=d;
                i++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                int d=nums[j];
                nums[j]=nums[m];
                nums[m]=d;
                j--;
            }
        }
    }   
}