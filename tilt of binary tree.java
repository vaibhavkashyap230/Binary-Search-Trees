// https://classroom.codingninjas.com/app/classroom/me/1108/content/29648/offering/311625/problem/5850

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
        private static int[] ct(BinaryTreeNode<Integer> temp)
        {
            if(temp==null)
            {
                int r[]={0,0};
                return r;
            }
            
            int l[]=ct(temp.left);
            int r[]=ct(temp.right);
            
            int ans[]=new int[2];
            int d=Math.abs(l[1]-r[1]);
            ans[0]=l[0]+r[0]+d;
            ans[1]=l[1]+r[1]+temp.data;
            return ans;
        }
        public static int getTilt(BinaryTreeNode<Integer> root)
        {
            if(root==null)
                return 0;
            
            int r[] = ct(root);
            return r[0];
        }  
    }