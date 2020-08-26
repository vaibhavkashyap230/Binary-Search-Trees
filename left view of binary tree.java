// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Tree
{
    void nextLevel(Queue<Node> q1,Queue<Node> q2)
    {
        System.out.print(q1.peek().data+" ");
        while(!q1.isEmpty())
        {
            Node temp = q1.poll();
            if(temp.left!=null)
                q2.add(temp.left);
            if(temp.right!=null)
                q2.add(temp.right);
        }
    }
    
    void leftView(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        while(q1.isEmpty()==false || q2.isEmpty()==false)
        {
            if(q1.isEmpty()==false)
                nextLevel(q1,q2);
            else
                nextLevel(q2,q1);
        }
    }
}
