package Day 2;

public class Merge_Intervals {
    public int[][] merge(int[][] n) {
        Arrays.sort(n, (a,b) -> (a[0]-b[0]));
        int s=n[0][0],e=n[0][1];
        List<int[]> nm=new ArrayList<>();
        for(int i=1;i<n.length;i++)
        {
            if(e>=n[i][0])
            {
                if(n[i][1]>=e)
                {
                    e=n[i][1];
                }
            }
            else
            {
                nm.add(new int[]{s,e});
                s=n[i][0];
                e=n[i][1];
            }
        }
        nm.add(new int[]{s,e});
        return nm.toArray(new int[0][]);
    }
}
