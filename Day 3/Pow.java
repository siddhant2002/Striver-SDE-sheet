package Day 3;

class Pow {
    public double myPow(double x, int n) {
        if(n==-2147483648)
        {
            return x==1 || x==-1 ? 1 : 0;
        }
        int p=n;
        p=Math.abs(p);
        double s=1.0;
        while(p>0)
        {
            if(p%2==0)
            {
                x*=x;
                p/=2;
            }
            else
            {
                s*=x;
                p--;
            }
            System.out.println(s+" "+p+" "+x);
        }
        return n<0 ? 1.0/s : s;
    }
}