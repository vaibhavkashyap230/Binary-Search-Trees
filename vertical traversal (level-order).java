// https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1

/*class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/

class pair
{
	Node node;
	int level;
	public pair(Node a,int b)
	{
		this.node = a;
		this.level = b;
	}
}

class BinaryTree
{
    static void verticalOrder(Node root)
    {
      Queue<pair> q = new LinkedList<pair>();
		  HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
		  q.add(new pair(root,0));
		  while(!q.isEmpty())
		  {
			  pair temp = q.poll();
			
			  if(hm.containsKey(temp.level))
				  hm.get(temp.level).add(temp.node.data);
			  else
			  {
				  ArrayList<Integer> d = new ArrayList<Integer>();
				  d.add(temp.node.data);
				  hm.put(temp.level,d);
			  }
			  if(temp.node.left!=null)
			  {
				  q.add(new pair(temp.node.left,temp.level-1));
			  }
			  if(temp.node.right!=null)
			  {
				  q.add(new pair(temp.node.right,temp.level+1));
			  }
		  }
      int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
      for (Map.Entry pair : hm.entrySet())
      {
            min = Math.min(min,(int)pair.getKey());
            max = Math.max(max,(int)pair.getKey());
      }
      for(int i=min;i<=max;i++)
      {
        if(hm.containsKey(i))
        {
                for(Integer in : hm.get(i))
                {
                    System.out.print(in+" ");
                }
        }
      }
   }
}
