// https://practice.geeksforgeeks.org/problems/expression-tree/1/

class GfG
{
    public int evalTree(Node root)
    {
        if(root.left==null && root.right==null)
            return Integer.parseInt(root.data);
            
        int left = evalTree(root.left);
        int right = evalTree(root.right);
        if(root.data.charAt(0)=='+')
            return left+right;
        else if(root.data.charAt(0)=='-')
            return left-right;
        else if(root.data.charAt(0)=='*')
            return left*right;
        else
            return left/right;
    }
}
