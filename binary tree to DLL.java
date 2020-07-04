// https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class GfG
{
    void change(Node temp,Node value[])
    {
        if(temp==null)
            return;
        
        change(temp.left,value);
        
        if(value[0]==null)
        {
            value[0] = temp;
            value[1] = temp;
        }
        else
        {
            value[1].right = temp;
            temp.left = value[1];
            value[1] = temp;
        }
        
        change(temp.right,value);
    }
    
    Node bToDLL(Node root)
    {
        Node value[] = new Node[2];
        change(root,value);
        return value[0];
    }
}
