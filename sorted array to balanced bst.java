// https://classroom.codingninjas.com/app/classroom/me/1108/content/29519/offering/309950/problem/1159

import java.util.*;

public class Solution 
{
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
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] a)
    {
        if(a.length==0)
            return null;
        
        if(a.length==1)
        {
            BinaryTreeNode<Integer> temp= new BinaryTreeNode<Integer>(a[0]);
            temp.left=null;
            temp.right=null;
            return temp;
        }
        
        int hi=a.length/2;
        if(a.length%2==0)
        {
            hi-=1;
        }
        BinaryTreeNode<Integer> head = new BinaryTreeNode<Integer>(a[hi]);
        head.left = SortedArrayToBST(Arrays.copyOfRange(a,0,hi));
        head.right = SortedArrayToBST(Arrays.copyOfRange(a,hi+1,a.length));
        
        return head;
	}
}