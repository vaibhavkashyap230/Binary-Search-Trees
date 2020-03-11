// https://classroom.codingninjas.com/app/classroom/me/1108/content/29648/offering/311625/problem/5853

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
        public static void serialize(BinaryTreeNode<Integer> root, ArrayList<Integer> tree)
        {
            if(root==null)
            {
                tree.add(-1);
                return;
            }
            
            tree.add(root.data);
            serialize(root.left,tree);
            serialize(root.right,tree);
        }

        public static BinaryTreeNode<Integer> des(ArrayList<Integer> a, int c[])
        {
            if(c[0]==a.size() || a.get(c[0])==-1)
                return null;
            
            BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(a.get(c[0]));
            c[0]+=1;
            temp.left=des(a,c);
            c[0]+=1;
            temp.right=des(a,c);
            
            return temp;
        }
        public static BinaryTreeNode<Integer> deSerialize(ArrayList<Integer> tree)
        {
            if(tree.size()==0)
            {
                return null;
            }
            
            int c[] = new int[1];
            BinaryTreeNode<Integer> root = des(tree,c);
            return root;
        }
    }