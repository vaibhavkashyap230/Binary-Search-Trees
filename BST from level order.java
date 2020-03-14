// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5882

import java.util.*;

public class Solution
{
    /*	Binary Tree Node class
       
       class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;
            
            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }
    */
    private static BinaryTreeNode<Integer> tfpo(ArrayList<Integer> a)
    {
        if(a.size()==0)
            return null;
        
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(a.get(0));
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i)<a.get(0))
                l.add(a.get(i));
            else
                r.add(a.get(i));
        }
        temp.left=tfpo(l);
        temp.right=tfpo(r);
        return temp;
    }
    public static BinaryTreeNode<Integer> constructBST(int post[], int n)
    {
        if(post.length==0)
            return null;
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i : post)
        {
            a.add(i);
        }
        return tfpo(a);
    }
}