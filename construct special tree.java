// https://classroom.codingninjas.com/app/classroom/me/1108/content/29648/offering/311625/problem/5816

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
        public static BinaryTreeNode<Integer> cst(int pre[],char cl[],int c[])
        {
            if(c[0]>=cl.length)
                return null;
            
            BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(pre[c[0]]);
            if(cl[c[0]]=='L')
            {
                return temp;
            }
            c[0]+=1;
            temp.left = cst(pre,cl,c);
            c[0]+=1;
            temp.right = cst(pre,cl,c);
            return temp;
        }
        public static BinaryTreeNode<Integer> specialtree(int pre[],char cl[], int n)
        {
            if(n==0)
                return null;
            
            int c[] = new int[1];
            BinaryTreeNode<Integer> root = cst(pre,cl,c);
            return root;
        }   
    }