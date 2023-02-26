package Day 17;

class Top_View_Of_Binary_Tree
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Map<Integer,Integer> nm=new TreeMap<>();
        Queue<Pair> kk=new LinkedList<>();
        kk.offer(new Pair(root,0));
        while(!kk.isEmpty())
        {
            Pair p=kk.poll();
            int x=p.val;
            Node n=p.n;
            if(nm.get(x)==null)
            {
                nm.put(x,n.data);
            }
            if(n.left!=null)
            {
                kk.offer(new Pair(n.left,x-1));
            }
            if(n.right!=null)
            {
                kk.offer(new Pair(n.right,x+1));
            }
        }
        //System.out.println(nm);
        ArrayList<Integer> m=new ArrayList<>();
        for(int p:nm.keySet())
        {
            m.add(nm.get(p));
        }
        return m;
    }
}
class Pair
{
    Node n;
    int val;
    Pair(Node n, int val)
    {
        this.n=n;
        this.val=val;
    }
}