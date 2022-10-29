package Day 2;

public class Find_The_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int s=nums[0],p=nums[0];
        do
        {
            s=nums[s];
            p=nums[nums[p]];
        }while(s!=p);
        p=nums[0];
        while(s!=p)
        {
            s=nums[s];
            p=nums[p];
        }
        return s;
    }
}
