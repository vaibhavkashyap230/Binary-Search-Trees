// https://classroom.codingninjas.com/app/classroom/me/1108/content/29518/offering/309939/problem/604

import java.util.ArrayList;

public class Solution
{
/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
        {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            return ans;
        }
        
        ArrayList<Integer> lmax = longestRootToLeafPath(temp.left);
        ArrayList<Integer> rmax = longestRootToLeafPath(temp.right);
        
        if(rmax.size()>lmax.size())
        {
            rmax.add(temp.data);
            return rmax;
        }
        
        lmax.add(temp.data);
        return lmax;
	}
}