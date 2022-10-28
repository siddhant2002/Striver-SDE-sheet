package Day 1;
import java.util.*;
class Pascal_Triangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> nm=new ArrayList<>();
        List<Integer> kk=new ArrayList<>();
        if(n==1)
        {
            kk.add(1);
            nm.add(new ArrayList<>(kk));
            return nm;
        }
        if(n==2)
        {
            kk.add(1);
            nm.add(new ArrayList<>(kk));
            kk.add(1);
            nm.add(new ArrayList<>(kk));
            return nm;
        }
        kk.add(1);
        nm.add(new ArrayList<>(kk));
        kk.add(1);
        nm.add(new ArrayList<>(kk));
        for(int i=3;i<=n;i++)
        {
            List<Integer> k=new ArrayList<>();
            k.add(1);
            for(int j=0;j<kk.size()-1;j++)
            {
                k.add(kk.get(j)+kk.get(j+1));
            }
            k.add(1);
            nm.add(new ArrayList<>(k));
            kk.clear();
            kk=k;
        }
        return nm;
    }
}