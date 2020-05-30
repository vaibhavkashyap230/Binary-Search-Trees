// https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1

class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/

public class Tree
{
	public void serialize(Node root, ArrayList<Integer> a)
	{
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root);
	    a.add(root.data);
	    while(!q.isEmpty())
	    {
	        Node temp = q.peek();
	        if(temp.left!=null)
	       {
	           q.add(temp.left);
	           a.add(temp.left.data);
	       }
	       else
	       {
	           a.add(-1);
	       }
	       if(temp.right!=null)
	       {
	           q.add(temp.right);
	           a.add(temp.right.data);
	       }
	       else
	       {
	           a.add(-1);
	       }
	       
	       q.poll();
	    }
	}
	
    public Node deSerialize(ArrayList<Integer> a)
    {
        Queue<Node> q = new LinkedList<Node>();
        int i = 1;
        Node root = new Node(a.get(0));
        q.add(root);
        while(i<a.size())
        {
            Node temp = q.peek();
            
            if(a.get(i)==-1)
                temp.left = null;
            else
                {
                    temp.left = new Node(a.get(i));
                    q.add(temp.left);
                }
            
            i+=1;
            
            if(a.get(i)==-1)
                temp.right = null;
            else
                {
                    temp.right = new Node(a.get(i));
                    q.add(temp.right);
                }
            
            i+=1;
            q.poll();
        }
        
        return root;
    }
}