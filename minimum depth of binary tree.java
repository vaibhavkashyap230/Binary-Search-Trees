// https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1

class Tree
{
    int minDepth(Node temp,int dep)
    {
        if(temp==null)
            return Integer.MAX_VALUE;
            
        if(temp.left==null && temp.right==null)
            return dep;
            
        int left = minDepth(temp.left,dep+1);
        int right = minDepth(temp.right,dep+1);
        return Math.min(left,right);
    }
    
	int minDepth(Node root)
	{
	    return minDepth(root,1);
	}
}
