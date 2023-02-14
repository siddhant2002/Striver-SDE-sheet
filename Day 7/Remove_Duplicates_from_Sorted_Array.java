package Day 7;

class Remove_Duplicates_from_Sorted_Array
{
    public int removeDuplicates(int[] nums) {
        int i,j;
        for(i=0,j=1;j<nums.length;)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else
            {
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}