package Day 3;

class Reverse_Pairs
{
    public int reversePairs(int[] nums) {
        return task(nums,0,nums.length-1);
    }
    public int task(int a[], int i, int j)
    {
        int p=0;
        if(i<j)
        {
            int m=i+(j-i)/2;
            p+=task(a,i,m);
            p+=task(a,m+1,j);
            p+=task1(a,i,m,j);
        }
        return p;
    }
    public int task1(int a[], int i, int m, int j)
    {
        int s=i,k=0,p=0,mid=m+1;
        for(int x=i;x<=m;x++)
        {
            while(mid<=j && a[x]>(2*(long)a[mid]))
            {
                mid++;
            }
            p+=(mid-m-1);
        }
        mid=m+1;
        int b[]=new int[j-i+1];
        while(s<=m && mid<=j)
        {
            if(a[s]>a[mid])
            {
                b[k++]=a[mid++];
            }
            else
            {
                b[k++]=a[s++];
            }
        }
        while(s<=m)
        {
            b[k++]=a[s++];
        }
        while(mid<=j)
        {
            b[k++]=a[mid++];
        }
        for(int x=i;x<=j;x++)
        {
            a[x]=b[x-i];
        }
        return p;
    }
}