// https://classroom.codingninjas.com/app/classroom/me/1108/content/29520/offering/309973/problem/78

import java.util.*;

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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return null;
        
        Node<BinaryTreeNode<Integer>> nn = new Node<BinaryTreeNode<Integer>>(root);
        ArrayList<Node<BinaryTreeNode<Integer>>> a = new ArrayList<Node<BinaryTreeNode<Integer>>>();
        a.add(nn);
        Queue<BinaryTreeNode<Integer>> q1 = new LinkedList<BinaryTreeNode<Integer>>();
        Queue<BinaryTreeNode<Integer>> q2 = new LinkedList<BinaryTreeNode<Integer>>();
        
        if(root.left!=null)
        {
            q1.add(root.left);
        }
        if(root.right!=null)
        {
            q1.add(root.right);
        }
        while(q1.size()>0 || q2.size()>0)
        {
            if(q1.size()>0)
            {
                Node<BinaryTreeNode<Integer>> head=null,tail=null;
                while(q1.size()>0)
                {
                    if(q1.peek().left!=null)
                    {
                        q2.add(q1.peek().left);
                    }
                    if(q1.peek().right!=null)
                    {
                        q2.add(q1.peek().right);
                    }
                    if(head==null)
                    {
                        head = new Node<BinaryTreeNode<Integer>>(q1.remove());
                        tail=head;
                    }
                    else
                    {
                        tail.next = new Node<BinaryTreeNode<Integer>>(q1.remove());
                        tail=tail.next;
                    }
                }
                a.add(head);
            }
            else
            {
                Node<BinaryTreeNode<Integer>> head=null,tail=null;
                while(q2.size()>0)
                {
                    if(q2.peek().left!=null)
                    {
                        q1.add(q2.peek().left);
                    }
                    if(q2.peek().right!=null)
                    {
                        q1.add(q2.peek().right);
                    }
                    if(head==null)
                    {
                        head = new Node<BinaryTreeNode<Integer>>(q2.remove());
                        tail=head;
                    }
                    else
                    {
                        tail.next = new Node<BinaryTreeNode<Integer>>(q2.remove());
                        tail=tail.next;
                    }
                }
                a.add(head);
            }
        }
        
        return a;
	}
}