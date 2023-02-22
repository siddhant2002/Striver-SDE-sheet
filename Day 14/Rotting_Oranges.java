package Day 14;

class Rotting_Oranges
{
    public int orangesRotting(int[][] g) {
        int k=g.length,p=g[0].length;
        Queue<int[]> nm=new LinkedList<>();
        int h=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(g[i][j]==2)
                {
                    nm.offer(new int[]{i,j,0});
                }
                else if(g[i][j]==1)
                {
                    h++;
                }
            }
        }
        int d[][]={{1,0},{0,1},{-1,0},{0,-1}};
        int t=0,m=0;
        while(!nm.isEmpty())
        {
            int a[]=new int[3];
            a=nm.poll();
            t=Math.max(t,a[2]);
            for(int f[]:d)
            {
                int x=f[0]+a[0];
                int y=f[1]+a[1];
                if(x<0||x>=k||y<0||y>=p||g[x][y]==0||g[x][y]==2)
                {
                    continue;
                }
                else if(g[x][y]==1)
                {
                    g[x][y]=2;
                    nm.offer(new int[]{x,y,a[2]+1});
                    m++;
                }
            }
        }
        return m!=h ? -1 : t;
    }
}