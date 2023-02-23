package Day 17;

class Binary_Tree_Inorder_Traversal
{
    public List<Integer> inorderTraversal(TreeNode root) {
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
        nm.add(root.val);
        task(root.right,nm);
    }
}