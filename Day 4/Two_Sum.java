package Day 4;

class Two_Sum
{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nm=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nm.containsKey(target-nums[i]))
            {
                a[0]=nm.get(target-nums[i]);
                a[1]=i;
                return a;
            }
            nm.put(nums[i],i);
        }
        return a;
    }
}