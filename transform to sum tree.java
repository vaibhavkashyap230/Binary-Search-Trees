// https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1/

Node is as follows:
class Tree{
int data;
Tree left,right;
Tree(int d){
	data=d;
	left=null;
	right=null;
}
}*/
class Tree
{
    private int change(Node temp)
    {
        if(temp==null)
            return 0;
            
        if(temp.left==null && temp.right==null)
        {
            int ret = temp.data;
            temp.data = 0;
            return ret;
        }
        
        int left = 0,right = 0;
        if(temp.left!=null)
            left = change(temp.left);
        if(temp.right!=null)
            right = change(temp.right);
        
        int dummy = temp.data;
        temp.data = left+right;
        return temp.data+dummy;
    }
    
    public void toSumTree(Node root)
    {
        change(root);
    }
}
