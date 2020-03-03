// https://classroom.codingninjas.com/app/classroom/me/1108/content/29520/offering/309962/problem/1601

/***************
 * BinaryTreeNode class already given - 
 * 
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
***************/

/**************
 * Main function that we are using internally 
 * 
public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					bst.insertData(input);
					break;
				case 2 : 
					input = s.nextInt();
					bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(bst.search(input));
					break;
				default :
					bst.printTree();
					return;
			}

		}
*******************/

public class BinarySearchTree
{
    private BinaryTreeNode<Integer> root;
    
    BinarySearchTree()
    {
        this.root=null;
    }
    
    private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> temp,int x)
    {
        if(temp==null)
        {
            BinaryTreeNode<Integer> nn=new BinaryTreeNode<Integer>(x);
            return nn;
        }
        
        if(x<temp.data)
        {
            temp.left=insert(temp.left,x);
        }
        else
        {
            temp.right=insert(temp.right,x);
        }
        return temp;
    }
    public void insertData(int x)
    {
        this.root=insert(this.root,x);
    }
    
    private boolean search(BinaryTreeNode<Integer> temp,int x)
    {
        if(temp==null)
            return false;
        
        if(x==temp.data)
            return true;
        
        if(x<temp.data)
            return search(temp.left,x);
        
        return search(temp.right,x);
    }
    public boolean search(int x)
    {
        return search(this.root,x);
    }
    
    private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> temp,int x)
    {
        if(temp==null)
            return temp;
        
        if(x<temp.data)
        {
            temp.left=delete(temp.left,x);
            return temp;
        }
        
        if(x>temp.data)
        {
            temp.right=delete(temp.right,x);
            return temp;
        }
        
        if(temp.left==null && temp.right==null)
            return null;
        
        if(temp.left==null && temp.right!=null)
            return temp.right;
        
        if(temp.right==null && temp.left!=null)
            return temp.left;
        
        BinaryTreeNode<Integer> it=temp.right;
        while(it.left!=null)
        {
            it=it.left;
        }
        temp.data=it.data;
        temp.right=delete(temp.right,it.data);
        
        return temp;
    }
    public void deleteData (int x)
    {
        this.root=delete(this.root,x);
    }
    
    private void print(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        System.out.print(temp.data+":");
        if(temp.left!=null)
        {
            System.out.print("L:"+temp.left.data+",");
        }
        if(temp.right!=null)
        {
            System.out.print("R:"+temp.right.data);
        }
        System.out.println();
        print(temp.left);
        print(temp.right);
    }
    public void printTree()
    {
        print(this.root);
    }
}