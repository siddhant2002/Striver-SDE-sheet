package Day 7;

class 3Sum
{
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> nm=new ArrayList<>();
        Arrays.sort(n);
        for(int i=0;i<n.length-2;i++)
        {
            if(i==0 || (i>0 && n[i]!=n[i-1]))
            {
                int l=i+1,r=n.length-1,s=-n[i];
                while(l<r)
                {
                    if(n[l]+n[r]==s)
                    {
                        nm.add(Arrays.asList(n[i],n[l],n[r]));
                        while(l<r && n[l]==n[l+1])
                        {
                            l++;
                        }
                        while(l<r && n[r]==n[r-1])
                        {
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if(n[l]+n[r]<s)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }
        return nm;   
    }
}