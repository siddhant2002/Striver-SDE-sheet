package Day 8;

class N_meetings_in_one_room
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<Pair> nm=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nm.add(new Pair(start[i],end[i]));
        }
        Collections.sort(nm);
        int c=1,m=nm.get(0).second;
        for(int i=1;i<n;i++)
        {
            if(nm.get(i).first>m)
            {
                c++;
                m=nm.get(i).second;
            }
        }
        return c;
    }
}
class Pair implements Comparable<Pair>
{
    int first,second;
    Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
    public int compareTo(Pair p)
    {
        if(second-p.second>0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
