package Day 18;

class Binary_Tree_Level_Order_Traversal
{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> nm=new ArrayList<>();
        Queue<TreeNode> kk=new LinkedList<>();
        kk.offer(root);
        if(root==null)
            return nm;
        while(!kk.isEmpty())
        {
            int p=kk.size();
            List<Integer> k=new ArrayList<>();
            for(int i=0;i<p;i++)
            {
                if(kk.peek().left!=null)
                    kk.offer(kk.peek().left);
                if(kk.peek().right!=null)
                    kk.offer(kk.peek().right);
                k.add(kk.poll().val);
            }
            nm.add(k);
        }
        return nm;
    }
}