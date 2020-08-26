// https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1/

class Tree
{
    private ArrayList<ArrayList<Integer>> fill(Node temp, ArrayList<ArrayList<Integer>> res,ArrayList<Integer> arr)
    {
        arr.add(temp.data);
        if(temp.left!=null)
            res = fill(temp.left,res,arr);
        if(temp.right!=null)
            res = fill(temp.right,res,arr);
        if(temp.left==null && temp.right==null)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            for(int i : arr)
            {
                cur.add(i);
            }
            res.add(cur);
        }
        arr.remove(arr.size()-1);
        return res;
    }
    
    public ArrayList<ArrayList<Integer>> Paths(Node root)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        return fill(root,res,arr);
    }
}
