// https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1

class Tree
{
    boolean check(Node temp,int sum)
    {
        if(temp.left==null && temp.right==null)
        {
            if(sum==temp.data)
                return true;
            return false;
        }
        
        boolean left = false,right = false;
        if(temp.left!=null)
            left = check(temp.left,sum-temp.data);
        if(left)
            return left;
        if(temp.right!=null)
            right = check(temp.right,sum-temp.data);
        return right;
    }
    boolean hasPathSum(Node node, int sum)
    {
        return check(node,sum);
    }
}
