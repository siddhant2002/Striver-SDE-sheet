package Day 9;

class Subset_Sums
{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> nm=new ArrayList<>();
        task(arr,0,0,nm);
        return nm;
        
    }
    public void task(ArrayList<Integer> nm, int i, int s, ArrayList<Integer> kk)
    {
        if(i==nm.size())
        {
            kk.add(s);
            return;
        }
        task(nm,i+1,s,kk);
        s+=nm.get(i);
        task(nm,i+1,s,kk);
        s-=nm.get(i);
    }
}