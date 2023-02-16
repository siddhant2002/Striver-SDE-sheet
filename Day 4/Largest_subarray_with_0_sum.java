package Day 4;

class Largest_subarray_with_0_sum
{
    int maxLen(int arr[], int n)
    {
        int max=0,s=0;
        Map<Integer,Integer> nm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            if(s==0)
            {
                max=i+1;
            }
            else if(nm.containsKey(s))
            {
                max=Math.max(max,i-nm.get(s));
            }
            else
            {
                nm.put(s,i);
            }
        }
        return max;
    }
}