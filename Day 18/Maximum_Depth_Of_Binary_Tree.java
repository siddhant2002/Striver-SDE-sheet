package Day 18;

class Maximum_Depth_Of_Binary_Tree
{
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int g=maxDepth(root.left);
        int h=maxDepth(root.right);
        return 1+Math.max(g,h);
    }
}