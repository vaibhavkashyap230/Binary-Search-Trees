// https://practice.geeksforgeeks.org/problems/maximum-node-level/1/

class Tree
{
    private static void fill(Node root,int level,ArrayList<Integer> res)
    {
        if(root==null)
            return;
            
        if(res.size()>level)
            res.set(level,res.get(level)+1);
        else
            res.add(1);
        
        fill(root.left,level+1,res);
        fill(root.right,level+1,res);
    }
    
    public static int maxNodeLevel(Node root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        fill(root,0,res);
        int max = 0;
        for(int i=1;i<res.size();i++)
        {
            if(res.get(i)>res.get(max))
                max = i;
        }
        return max;
    }
}
