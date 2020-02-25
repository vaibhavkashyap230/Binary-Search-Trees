// https://classroom.codingninjas.com/app/classroom/me/1108/content/28866/offering/301707/problem/2020

/*class BinaryTreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 left=null;
 right=null;
 }*/
public class solution
{
    private static void print(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
    private static void rep(BinaryTreeNode<Integer> root,int d)
    {
        if(root==null)
            return;
        
        root.data=d;
        rep(root.left,d+1);
        rep(root.right,d+1);
    }
	public static void replaceDepth(BinaryTreeNode<Integer> n1)
    {
        rep(n1,0);
        print(n1);
	}
}