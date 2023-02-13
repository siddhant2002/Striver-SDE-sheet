package Day 3;

class Majority_Element {
    public int majorityElement(int[] nums) {
        int count=0,ele=-1;
        for(int i:nums)
        {
            if(count==0)
            {
                ele=i;
                count++;
            }
            else if(ele==i)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return ele;
    }
}