// https://classroom.codingninjas.com/app/classroom/me/1108/content/28867/offering/301726/problem/512

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
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        if(root.left==null)
        {
            root.left=new BinaryTreeNode<Integer>(root.data);
        }
        else
        {
            BinaryTreeNode<Integer> temp=root.left;
            root.left= new BinaryTreeNode<Integer>(root.data);
            root.left.left=temp;
        }
        
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
	}
}