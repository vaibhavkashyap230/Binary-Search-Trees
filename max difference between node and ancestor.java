// https://practice.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1

/*
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    int check(Node temp,int cur_max[])
    {
        if(temp==null)
            return Integer.MAX_VALUE;
            
        if(temp.left==null && temp.right==null)
            return temp.data;
        
        int left = check(temp.left,cur_max);
        int right = check(temp.right,cur_max);
        
        int im = Math.min(left,right);
        cur_max[0] = Math.max(temp.data-im,cur_max[0]);
        return Math.min(temp.data,im);
    }
    
    int maxDiff(Node root)
    {
        int cur_max[] = new int[1];
        cur_max[0] = Integer.MIN_VALUE;
        check(root,cur_max);
        return cur_max[0];
    }
}
