// https://classroom.codingninjas.com/app/classroom/me/1108/content/30556/offering/323357/problem/370

import java.util.*;
public class solution
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
    private static BinaryTreeNode<Integer> parent(BinaryTreeNode<Integer> temp,int x,BinaryTreeNode<Integer> par)
    {
        if(temp==null)
            return null;
        
        if(temp.data==x)
            return par;
        
        BinaryTreeNode<Integer> l = parent(temp.left,x,temp);
        if(l!=null)
            return l;
        
        return parent(temp.right,x,temp);
    }
    private static int level(BinaryTreeNode<Integer> temp,int x,int l)
    {
        if(temp==null)
            return -1;
        
        if(temp.data==x)
            return l;
        
        int le = level(temp.left,x,l+1);
        if(le!=-1)
            return le;
        
        return level(temp.right,x,l+1);
    }
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q)
    {
        int pl = level(root,p,0);
        int ql = level(root,q,0);
        if(pl!=ql)
            return false;
        
        BinaryTreeNode<Integer> pp = parent(root,p,null);
        BinaryTreeNode<Integer> qp = parent(root,q,null);
        if(pp==qp)
            return false;
        
        return true;
	}
}