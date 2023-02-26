package Day 18;

class Balanced_Binary_Tree
{
    public boolean isBalanced(TreeNode root) {
        return task(root) != -1; 
    }
    public int task(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=task(root.left);
        if(left==-1)
        {
            return -1;
        }
        int right=task(root.right);
        if(right==-1)
        {
            return -1;
        }
        if(Math.abs(right-left)>1)
        {
            return -1;
        }
        return 1+Math.max(left,right);
    }
}