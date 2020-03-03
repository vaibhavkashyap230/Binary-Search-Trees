// https://classroom.codingninjas.com/app/classroom/me/1108/content/29519/offering/309955/problem/535

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
	private static int change(BinaryTreeNode<Integer> temp,int s)
    {
        if(temp==null)
            return s;
        
        int ps = change(temp.right,s);
        temp.data+=ps;
        return change(temp.left,temp.data);
    }
    
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        change(temp,0);
	}
}