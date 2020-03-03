// https://classroom.codingninjas.com/app/classroom/me/1108/content/29519/offering/309955/problem/1160

public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/
    private static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int x)
    {
        if(head==null)
        {
            LinkedListNode<Integer> nn = new LinkedListNode<Integer>(x);
            return nn;
        }
        
        LinkedListNode<Integer> nn = new LinkedListNode<Integer>(x);
        nn.next=head;
        return nn;
    }
    private static LinkedListNode<Integer> convert(BinaryTreeNode<Integer> temp,LinkedListNode<Integer> head)
    {
        if(temp==null)
            return head;
        
        head=convert(temp.right,head);
        head=insert(head,temp.data);
        head=convert(temp.left,head);
        
        return head;
    }
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return null;
        
        LinkedListNode<Integer> head = convert(root,null);
        return head;
	}
}