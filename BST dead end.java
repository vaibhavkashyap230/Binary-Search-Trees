// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5883

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
    private static boolean check(BinaryTreeNode<Integer> temp,int min,int max)
    {
        if(temp==null)
            return false;
        
        if(max==min)
        {
            return true;
        }
        
        boolean l = check(temp.left,min,temp.data-1);
        boolean r = check(temp.right,temp.data+1,max);
        
        return (l || r);
    }
    public static boolean deadEnd(BinaryTreeNode<Integer> root)
    {
        return check(root,0,Integer.MAX_VALUE);
    }
}