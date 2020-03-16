// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5888

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
    private static int median(BinaryTreeNode<Integer> temp,int c[])
    {
        if(temp==null)
            return -1;
        
        int l = median(temp.left,c);
        if(l!=-1)
            return l;
        
        c[0]-=1;
        if(c[0]==0)
            return temp.data;
        
        return median(temp.right,c);
    }
    private static void count(BinaryTreeNode<Integer> temp,int c[])
    {
        if(temp==null)
            return;
        
        c[0]+=1;
        count(temp.left,c);
        count(temp.right,c);
    }
    public static int median(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        
        int c[] = new int[1];
        count(root,c);
        int n = c[0];
        if(n==1)
            return root.data;
        
        c[0]=0;
        if(n%2==1)
        {
            c[0]=(n/2)+1;
            return median(root,c);
        }
        else
        {
            c[0]=n/2;
            int d1=median(root,c);
            c[0]=(n/2)+1;
            int d2=median(root,c);
            return (d1+d2)/2;
        }
    }
}