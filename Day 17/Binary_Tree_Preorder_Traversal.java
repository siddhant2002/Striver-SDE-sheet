package Day 17;

class Binary_Tree_Preorder_Traversal
{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nm=new ArrayList<>();
        task(root,nm);
        return nm;
    }
    public void task(TreeNode root , List<Integer> nm)
    {
        if(root==null)
            return;
        nm.add(root.val);
        task(root.left,nm);
        task(root.right,nm);
    }
}