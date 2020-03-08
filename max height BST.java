// https://classroom.codingninjas.com/app/classroom/me/1108/content/29520/offering/309973/problem/520

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
  /*
  a[0]=min value
  a[1]=max value
  a[2]=is_BST
  a[3]=max BST height
  */
	private static int[] lbst(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
        {
            int re[] = {-1,-1,1,0};
            return re;
        }
        
        int l[] = lbst(temp.left);
        int r[] = lbst(temp.right);
        
        if(l[2]==0 || r[2]==0)
        {
            int re[] = {0,0,0,Math.max(l[3],r[3])};
            return re;
        }
        
        if(l[0]==-1)
        {
            l[0]=temp.data;
        }
        if(l[1]==-1)
        {
            l[1]=temp.data;
        }
        if(r[0]==-1)
        {
            r[0]=temp.data;
        }
        if(r[1]==-1)
        {
            r[1]=temp.data;
        }
        if(temp.data<l[0] || temp.data>r[1] || temp.data<l[1] || temp.data>r[0])
        {
            int re[] = {0,0,0,Math.max(l[3],r[3])}; 
            return re;
        }
        
        int re[] = {l[0],r[1],1,Math.max(l[3],r[3])+1};
        return re;
    }
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        
        int r[] = lbst(root);
        return r[3];
	}
}