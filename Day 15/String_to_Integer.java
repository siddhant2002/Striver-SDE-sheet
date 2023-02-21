package Day 15;

class String_to_Integer
{
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }
        char c=s.charAt(0);
        if((c>='a' && c<='z')||(c>='A' && c<='Z')||c=='.')
        {
            return 0;
        }
        long k=0;
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if(i==0 && (d=='+' || d=='-'))
            {
                continue;
            }
            else if(d>='0' && d<='9')
            {
                k=k*10+(long)(d-'0');
            }
            else
            {
                break;
            }
            if(k>2147483647)
            {
                k=2147483648L;
                break;
            }
        }
        return c=='-' ? k >= (long)2147483648L ? -2147483648 : (int)-k : k >= (long)2147483648L ? 2147483647 : (int)k;
    }
}