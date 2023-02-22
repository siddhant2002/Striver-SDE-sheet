package Day 17;

class Binary_Tree_Right_Side_View
{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> nm=new ArrayList<>();
        Queue<TreeNode> kk=new LinkedList<>();
        if(root==null)
            return nm;
        kk.offer(root);
        while(!kk.isEmpty())
        {
            int k=kk.size();
            for(int i=1;i<=k;i++)
            {                
                if(kk.peek().left!=null)
                    kk.offer(kk.peek().left);
                if(kk.peek().right!=null)
                    kk.offer(kk.peek().right);
                if(i==k)
                {
                    nm.add(kk.poll().val);
                    break;
                }
                kk.poll();
            }
        }
        return nm;
    }
}