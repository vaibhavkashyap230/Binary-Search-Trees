// https://practice.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1/

/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class pair
{
    Node node;
    int level;
    public pair(Node temp,int x)
    {
        this.node = temp;
        this.level = x;
    }
}

class Tree
{
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        Queue<pair> q = new LinkedList<pair>();
        q.add(new pair(root,0));
        ArrayList<Integer> res = new ArrayList<Integer>();
        int max = 0;
        while(!q.isEmpty())
        {
            pair temp = q.poll();
            if(temp.level<res.size())
                res.set(temp.level,res.get(temp.level)+temp.node.data);
            else
                res.add(temp.node.data);
            
            if(temp.node.left!=null)
                q.add(new pair(temp.node.left,temp.level+1));
            if(temp.node.right!=null)
                q.add(new pair(temp.node.right,temp.level));
        }
        return res;
    }
}
