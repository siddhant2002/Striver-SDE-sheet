package Day 17;

class Binary_Tree_Postorder_Traversal
{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nm=new ArrayList<>();
        task(root,nm);
        return nm;
    }
    void task(TreeNode root, List<Integer> nm)
    {
        if(root==null)
        {
            return;
        }
        task(root.left,nm);
        task(root.right,nm);
        nm.add(root.val);
    }
}