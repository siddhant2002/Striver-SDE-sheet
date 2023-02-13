package Day 2;

import java.util.* ;
import java.io.*; 
public class Count_Inversions 
{
    public static long getInversions(long arr[], int n) {
        return task(arr,0,(int)(n-1));
    }
    public static int task(long a[], int i, int j)
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
	public static int task1(long a[], int i, int j, int l)
	{
	    int s=i,mid=j+1,k=0;
	    int m=0;
	    long b[]=new long[l-i+1];
	    while(s<=j && mid<=l)
	    {
	        if(a[s]>a[mid])
	        {
	            b[k++]=a[mid++];
	            m+=(long)(j-s+1);
	        }
	        else
	        {
	            b[k++]=a[s++];
	            
	        }
	    }
	    while(s<=j)
	    {
	        b[k++]=a[s++];
	    }
	    while(mid<=l)
	    {
	        b[k++]=a[mid++];
	    }
	    for(int p=i;p<=l;p++)
	    {
	        a[p]=b[p-i];
	    }
	    return m;
	}
}