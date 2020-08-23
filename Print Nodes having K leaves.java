// https://practice.geeksforgeeks.org/problems/print-nodes-having-k-leaves/1/

class GfG
{
    
    private int kLeaves(Node temp,int k,ArrayList<Integer> result)
    {
        if(temp==null)
            return 0;
            
        int count = kLeaves(temp.left,k,result);
        count+=kLeaves(temp.right,k,result);
        if(count==k)
            result.add(temp.data);
        if(temp.left==null && temp.right==null)
            count++;
        return count;
    }
    
    public ArrayList<Integer> btWithKleaves(Node root, int k)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        kLeaves(root,k,result);
        if(result.size()==0)
            result.add(-1);
        return result;
    }
}
