// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class pair
{
    Node node;
    int position;
    public pair(Node temp,int x)
    {
        this.node = temp;
        this.position = x;
    }
}

class Tree
{

    public ArrayList <Integer> bottomView(Node root)
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Queue<pair> q = new LinkedList<pair>();
        q.add(new pair(root,0));
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            pair temp = q.poll();
            hm.put(temp.position,temp.node.data);
            
            if(temp.node.left!=null)
                q.add(new pair(temp.node.left,temp.position-1));
            if(temp.node.right!=null)
                q.add(new pair(temp.node.right,temp.position+1));
                
            if(temp.position<min)
                min = temp.position;
            if(temp.position>max)
                max = temp.position;
        }
        for(int i=min;i<=max;i++)
        {
            if(hm.containsKey(i))
                result.add(hm.get(i));
        }
        return result;
    }
}
