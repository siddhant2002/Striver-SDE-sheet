package Day 8;

class Minimum_Platforms
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,c=1,m=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                c++;
                i++;
            }
            else
            {
                c--;
                j++;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}