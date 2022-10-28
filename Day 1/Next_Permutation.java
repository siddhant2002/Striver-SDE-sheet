package Day 1;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        int p=-1,s=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                p=i;
                break;
            }
        }
        //System.out.println(p);
        if(p==-1)
        {
            for(int i=0;i<nums.length/2;i++)
            {
                int m=nums[i];
                nums[i]=nums[nums.length-1-i];
                nums[nums.length-1-i]=m;
            }
            return;
        }
        for(int i=nums.length-1;i>=p;i--)
        {
            if(nums[i]>nums[p])
            {
                s=i;
                break;
            }
        }
        int d=nums[p];
        nums[p]=nums[s];
        nums[s]=d;
        for(int i=p+1,j=1;i<(nums.length+p+1)/2;i++,j++)
        {
            int m=nums[i];
            nums[i]=nums[nums.length-j];
            nums[nums.length-j]=m;
        }
    }   
}