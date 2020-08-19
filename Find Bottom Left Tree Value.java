// https://leetcode.com/problems/find-bottom-left-tree-value/

class Solution
{
    
    private int next(Queue<TreeNode> q1,Queue<TreeNode> q2)
    {
        int res = q1.peek().val;
        while(q1.isEmpty()==false)
        {
            TreeNode temp = q1.poll();
            if(temp.left!=null)
                q2.add(temp.left);
            if(temp.right!=null)
                q2.add(temp.right);
        }
        return res;
    }
    
    public int findBottomLeftValue(TreeNode root)
    {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(root);
        int result = root.val;
        while(q1.isEmpty()!=true || q2.isEmpty()!=true)
        {
            if(!q1.isEmpty())
                result = next(q1,q2);
            else
                result = next(q2,q1);
        }
        return result;
    }
}
