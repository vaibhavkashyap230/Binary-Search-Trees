// https://classroom.codingninjas.com/app/classroom/me/1108/content/29648/offering/311625/problem/5849

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
        private static BinaryTreeNode<Integer> tfa(int a[], int pd)
        {
            int in=-1;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==pd)
                {
                    in=i;
                    a[in]=-100;
                    break;
                }
            }
            
            if(in==-1)
                return null;
            
            BinaryTreeNode<Integer> temp = new BinaryTreeNode(in);
            temp.left = tfa(a,in);
            temp.right = tfa(a,in);
            
            return temp;
        }
        public static BinaryTreeNode<Integer> constructBT(int[] a, int n)
        {
            return tfa(a,-1);
        }
}