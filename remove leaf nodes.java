package code;

public class Solution
{
	private static TreeNode<Integer> insert(TreeNode<Integer> temp,int x)
	{
		if(temp==null)
		{
			return new TreeNode<Integer>(x);
		}
		
		if(x<temp.data)
			temp.left=insert(temp.left,x);
		else
			temp.right=insert(temp.right,x);
		
		return temp;
	}
	private static void print(TreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	private static TreeNode<Integer> rln(TreeNode<Integer> temp)
	{
		if(temp==null)
			return temp;
		
		if(temp.left==null && temp.right==null)
			return null;
		
		temp.left=rln(temp.left);
		temp.right=rln(temp.right);
		
		return temp;
	}
	public static void main(String[] args)
	{
		TreeNode<Integer> root=null;
		root=insert(root,20);
		root=insert(root,15);
		root=insert(root,18);
		root=insert(root,10);
		root=insert(root,5);
		root=insert(root,25);
		root=insert(root,22);
		root=insert(root,28);
		root=insert(root,35);
		print(root);
		System.out.println();
		
		root=rln(root);
		print(root);
	}
}