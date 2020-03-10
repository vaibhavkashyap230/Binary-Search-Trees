// https://classroom.codingninjas.com/app/classroom/me/1108/content/29518/offering/309939/problem/772

public class Solution
{
    private static void plb(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        if(temp.left!=null)
        {
            System.out.print(temp.data+" ");
            plb(temp.left);
        }
        else if(temp.right!=null)
        {
            System.out.print(temp.data+" ");
            plb(temp.right);
        }
    }
    private static void prb(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        if(temp.right!=null)
        {
            prb(temp.right);
            System.out.print(temp.data+" ");
        }
        else if(temp.left!=null)
        {
            prb(temp.left);
            System.out.print(temp.data+" ");
        }
    }
    private static void pln(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        pln(temp.left);
        if(temp.right==null && temp.left==null)
        {
            System.out.print(temp.data+" ");
        }
        pln(temp.right);
    }
	public static void solve(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        System.out.print(root.data+" ");
        plb(root.left);
        pln(root.left);
        pln(root.right);
        prb(root.right);
	}
}