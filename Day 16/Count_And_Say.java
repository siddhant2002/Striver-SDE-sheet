package Day 16;

class Count_And_Say
{
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String s="11";
        for(int i=3;i<=n;i++)
        {
            s=task(s);
        }
        return s;
    }
    public String task(String s)
    {
        int k=s.length(),c=1;
        StringBuilder nm=new StringBuilder();
        for(int i=1;i<k;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                c++;
            }
            else
            {
                nm.append(c);
                nm.append(s.charAt(i-1));
                c=1;
            }
        }
        nm.append(c);
        nm.append(s.charAt(k-1));
        return nm.toString();
    }
}