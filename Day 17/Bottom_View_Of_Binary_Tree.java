package Day 17;

class Bottom_View_Of_Binary_Tree
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Map<Integer,Integer> kk=new TreeMap<>();
        Queue<Pair> m=new LinkedList<>();
        m.offer(new Pair(root,0));
        while(!m.isEmpty())
        {
            Pair p=m.poll();
            Node n=p.n;
            int val=p.v;
            kk.put(val,n.data);
            if(n.left!=null)
            {
                m.offer(new Pair(n.left,val-1));
            }
            if(n.right!=null)
            {
                m.offer(new Pair(n.right,val+1));
            }
        }
        ArrayList<Integer> nm=new ArrayList<>();
        for(int i:kk.keySet())
        {
            nm.add(kk.get(i));
        }
        return nm;
    }
}
class Pair
{
    Node n;
    int v;
    Pair(Node n, int v)
    {
        this.n=n;
        this.v=v;
    }
}