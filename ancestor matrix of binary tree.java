// https://classroom.codingninjas.com/app/classroom/me/1108/content/29648/offering/311625/problem/5817

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
        private static int[] filla(BinaryTreeNode<Integer> temp,int a[][])
        {
            if(temp==null)
            {
                int r[] = new int[0];
                return r;
            }
            
            int l[] = filla(temp.left,a);
            int r[] = filla(temp.right,a);
            
            int ret[] = new int[l.length+r.length+1];
            ret[0]=temp.data;
            if(l.length+r.length==0)
            {
                return ret;
            }
            int c=1;
            for(int j=0;j<l.length;j++)
            {
                a[temp.data][l[j]]=1;
                ret[c]=l[j];
                c+=1;
            }
            for(int j=0;j<r.length;j++)
            {
                a[temp.data][r[j]]=1;
                ret[c]=r[j];
                c+=1;
            }
            
            return ret;
        }
        public static void ancestor(BinaryTreeNode<Integer> root, int[][] a)
        {
            filla(root,a);
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }