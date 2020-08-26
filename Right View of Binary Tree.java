// https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1/

class Tree
{
    
    void nextLevel(Queue<Node> q1,Queue<Node> q2)
    {
        while(q1.size()>0)
        {
            Node temp = q1.poll();
            if(temp.left!=null)
                q2.add(temp.left);
            if(temp.right!=null)
                q2.add(temp.right);
            
            if(q1.size()==0)
                System.out.print(temp.data+" ");
        }
    }
    
    void rightView(Node node)
    {
        if(node==null)
            return;
        
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(node);
        while(q1.size()>0 || q2.size()>0)
        {
            if(q1.size()>0)
                nextLevel(q1,q2);
            else
                nextLevel(q2,q1);
        }
    }
}
