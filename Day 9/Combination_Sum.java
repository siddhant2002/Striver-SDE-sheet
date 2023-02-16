package Day 9;

class Combination_Sum
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> nm=new ArrayList<>();
        List<Integer> kk=new ArrayList<>();
        task(nm,kk,candidates,target,0);
        return nm;
    }
    public void task(List<List<Integer>> nm, List<Integer> kk, int a[], int target, int i)
    {
        if(i==a.length)
        {
            if(target==0)
            {
                nm.add(new ArrayList<>(kk));
            }
            return;
        }
        if(a[i]<=target)
        {
            kk.add(a[i]);
            task(nm,kk,a,target-a[i],i);
            kk.remove(kk.size()-1);
        }
        task(nm,kk,a,target,i+1);
    }
}