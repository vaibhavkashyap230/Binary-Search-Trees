// https://classroom.codingninjas.com/app/classroom/me/1108/content/30556/offering/323357/problem/1294

import java.util.*;
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
    private static void fill(BinaryTreeNode<Integer> temp,HashMap<Integer,ArrayList<Integer>> hm,int d,int m[])
    {
        if(temp==null)
            return;
        
        if(d<m[0])
            m[0]=d;
        if(d>m[1])
            m[1]=d;
        
        if(hm.containsKey(d))
        {
            hm.get(d).add(temp.data);
        }
        else
        {
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(temp.data);
            hm.put(d,a);
        }
        fill(temp.left,hm,d-1,m);
        fill(temp.right,hm,d+1,m);
    }
	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        int m[] = new int[2];
        m[0]=Integer.MAX_VALUE;
        m[1]=Integer.MIN_VALUE;
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
        fill(root,hm,0,m);
        for(int i=m[0];i<=m[1];i++)
        {
            ArrayList<Integer> a = hm.get(i);
            for(int j=0;j<a.size();j++)
            {
                System.out.print(a.get(j)+" ");
            }
            System.out.println();
        }
	}
}
