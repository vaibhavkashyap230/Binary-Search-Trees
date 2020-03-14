package code;

public class Solution
{
	private static TreeNode<Integer> find(TreeNode<Integer> root,int x)
	{
		if(root==null)
			return root;
		
		if(root.data==x)
		{
			return root;
		}
		
		if(x<root.data)
		{
			return find(root.left,x);
		}
		else
		{
			return find(root.right,x);
		}
	}
	private static int inorder_successor(TreeNode<Integer> root,int x)
	{
      try{
		TreeNode<Integer> temp=find(root,x);
		
		if(temp.right!=null)
		{
			TreeNode<Integer> d=temp.right;
			while(d.left!=null)
			{
				d=d.left;
			}
			return d.data;
		}
		
		TreeNode<Integer> child=root,par=null;
		while(child!=temp)
		{
			if(x<child.data)
			{
				par=child;
				child=child.left;
			}
			else
			{
				child=child.right;
			}
		}
        return par.data;}
      catch (Exception e)
      {
        return -1;
      } 
	}
	public static void main(String[] args)
	{
		int a[]= {25,15,35,10,20,30,40,-1,13,18,-1,27,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1};
		TreeNode<Integer> root=TreeNode.insert_level_order(a);
		int c[] = {10,13,15,18,20,25,27,30,35,40,45};
		for(int i : c)
		{
			System.out.print(inorder_successor(root,i)+" ");
		}
	}
}