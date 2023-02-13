package Day 3;

class Majority_Element_II
{
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,ele1=-1,ele2=-1;
        for(int i:nums)
        {
            if(ele1==i)
            {
                count1++;
            }
            else if(ele2==i)
            {
                count2++;
            }
            else if(count1==0)
            {
                ele1=i;
                count1++;
            }
            else if(count2==0)
            {
                ele2=i;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        List<Integer> nm=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(i==ele1)
            {
                count1++;
            }
            else if(i==ele2)
            {
                count2++;
            }
        }
        if(count1>nums.length/3)
        {
            nm.add(ele1);
        }
        if(count2>nums.length/3)
        {
            nm.add(ele2);
        }
        return nm;
    }
}