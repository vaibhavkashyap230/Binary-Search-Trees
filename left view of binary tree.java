// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Tree
{
    void leftView(Node temp)
    {
        if(temp==null)
        return;
        
        System.out.print(temp.data+" ");
        if(temp.left!=null)
        {
            leftView(temp.left);
        }
        else
        {
            leftView(temp.right);
        }
    }
}
