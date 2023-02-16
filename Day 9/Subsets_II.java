package Day 9;

class Subsets_II
{
    public List<List<Integer>> subsetsWithDup(int[] n) {
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        Arrays.sort(n);
        task(nm,new ArrayList<>(),n,0);
        return nm;
    }
    static void task(List<List<Integer>> nm , ArrayList<Integer> kk , int n[] , int p)
    {
        nm.add(new ArrayList<>(kk));
        for(int i=p;i<n.length;i++)
        {
            if(i>p&&n[i]==n[i-1])
                continue;
            kk.add(n[i]);
            task(nm,kk,n,i+1);
            kk.remove(kk.size()-1);
        }
    }
}