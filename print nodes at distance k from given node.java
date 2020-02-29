// https://classroom.codingninjas.com/app/classroom/me/1108/content/28867/offering/301726/problem/81

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
    private static void set(BinaryTreeNode<Integer> temp,BinaryTreeNode<Integer> pre,HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> ht)
	{
		if(temp==null)
		return;
		
		ht.put(temp, pre);
		set(temp.left,temp,ht);
		set(temp.right,temp,ht);
	}
    private static void disk(BinaryTreeNode<Integer> temp,HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> ht ,int k,HashMap<BinaryTreeNode<Integer>,Integer> seen)
    {
         if(temp==null)
             return;
        
        if(seen.containsKey(temp))
            return;
        
        seen.put(temp,1);
        if(k==0)
        {
            System.out.println(temp.data);
            return;
        }
        
        disk(ht.get(temp),ht,k-1,seen);
        disk(temp.left,ht,k-1,seen);
        disk(temp.right,ht,k-1,seen);
    }
    private static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer> temp,int t)
    {
        if(temp==null)
            return temp;
        
        if(temp.data==t)
        {
            return temp;
        }
        
        BinaryTreeNode<Integer> l=find(temp.left,t);
        if(l!=null)
            return l;
        
        BinaryTreeNode<Integer> r=find(temp.right,t);
        if(r!=null)
            return r;
        
        return null;
    }
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int t, int k)
    {
        HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> ht=new HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>>();
        set(root,null,ht);
        HashMap<BinaryTreeNode<Integer>,Integer> seen=new HashMap<BinaryTreeNode<Integer>,Integer>();
        BinaryTreeNode<Integer> node=find(root,t);
        disk(node,ht,k,seen);
	}
}