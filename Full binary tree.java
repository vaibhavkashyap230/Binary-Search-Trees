// https://practice.geeksforgeeks.org/problems/full-binary-tree/1/

class GfG
{
    // Return True if the given Binary Tree is a Full Binary Tree. Else return False
	boolean isFullTree(Node node)
    {
        if(node==null)
            return true;
        
        if(node.left==null && node.right!=null)
            return false;
        if(node.right==null && node.left!=null)
            return false;
        
        return isFullTree(node.left) && isFullTree(node.right);
    }
}
