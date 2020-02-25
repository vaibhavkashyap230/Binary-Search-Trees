public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
            return 0;
        
        int l=numNodesGreaterX(root.left,x);
        int r=numNodesGreaterX(root.right,x);
        if(root.data>x)
            return l+r+1;
        else
            return l+r;
	}
	
}