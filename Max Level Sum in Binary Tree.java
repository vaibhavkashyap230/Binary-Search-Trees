// https://practice.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1/

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class GfG
{
    
    private int layerSum(Queue<Node> q1,Queue<Node>q2)
    {
        int sum = 0;
        while(!q1.isEmpty())
        {
            Node temp = q1.poll();
            sum+=temp.data;
            if(temp.left!=null)
                q2.add(temp.left);
            if(temp.right!=null)
                q2.add(temp.right);
        }
        return sum;
    }
    
    public int maxLevelSum(Node root)
    {
        int max = root.data;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        while(!q1.isEmpty() || !q2.isEmpty())
        {
            int layerSum;
            if(q1.isEmpty())
                layerSum = layerSum(q2,q1);
            else
                layerSum = layerSum(q1,q2);
                
            if(layerSum>max)
                max = layerSum;
        }
        return max;
    }
}
