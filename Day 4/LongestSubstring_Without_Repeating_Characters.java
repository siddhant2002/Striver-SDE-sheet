package Day 4;

class Longest_Substring_Without_Repeating_Characters
{
    public int lengthOfLongestSubstring(String s) {
        int c[]=new int[256];
        Arrays.fill(c,-1);
        int i=0,j=0,ans=0;
        while(j<s.length())
        {
            if(c[(int)s.charAt(j)]!=-1)
            {
                i=Math.max(i,c[(int)s.charAt(j)]+1);
            }
            ans=Math.max(ans,j-i+1);
            c[(int)s.charAt(j)]=j;
            j++;
        }
        return ans;
    }
}