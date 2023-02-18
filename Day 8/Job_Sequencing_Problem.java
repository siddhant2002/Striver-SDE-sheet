package Day 8;

class Job_Sequencing_Problem
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b) -> (b.profit - a.profit));
        int max=arr[0].deadline;
        for(int i=1;i<n;i++)
        {
            max=Math.max(max, arr[i].deadline);
        }
        int a[]=new int[max+1];
        Arrays.fill(a,-1);
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            int j=arr[i].deadline;
            while(j>0)
            {
                if(a[j]==-1)
                {
                    a[j]=i;
                    c++;
                    sum+=arr[i].profit;
                    break;
                }
                j--;
            }
        }
        int x[]=new int[2];
        x[0]=c;
        x[1]=sum;
        return x;
    }
}