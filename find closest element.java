// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5887

import java.util.*;

public class Solution
{
    /* Structure of BinaryTreeNode class is:

        class BinaryTreeNode<T> {
		    T data;
		    BinaryTreeNode<T> left;
		    BinaryTreeNode<T> right;

		    public BinaryTreeNode(T data) {
			    this.data = data;
		    }
	    }
    
    */
    private static int minvalue(BinaryTreeNode<Integer> root,int k)
    {
        if(root==null)
            return Integer.MAX_VALUE;
        
        int l = minvalue(root.left,k);
        int r = minvalue(root.right,k);
        
        if(Math.abs(r-k)<Math.abs(l-k) && Math.abs(r-k)<Math.abs(root.data-k))
            return r;
        if(Math.abs(l-k)<Math.abs(r-k) && Math.abs(l-k)<Math.abs(root.data-k))
            return l;
            
        return root.data;
    }
    public static int minDiff(BinaryTreeNode<Integer> root, int k)
    {
        return minvalue(root,k);
    }
}