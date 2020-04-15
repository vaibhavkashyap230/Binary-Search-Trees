// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

class Solution
{
    public TreeNode lowestCommonAncestor(TreeNode temp, TreeNode a, TreeNode b)
    {
        if(temp==null)
            return null;
        
        if(temp==a || temp==b)
            return temp;
        
        TreeNode l = lowestCommonAncestor(temp.left,a,b);
        TreeNode r = lowestCommonAncestor(temp.right,a,b);
        
        if(l!=null && r!=null)
            return temp;
        
        if(l!=null)
            return l;
        
        return r;
    }
}
