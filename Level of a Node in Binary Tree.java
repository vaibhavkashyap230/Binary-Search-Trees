// https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1/

class Solution
{
    int getLevel(Node temp,int data,int level)
    {
        if(temp==null)
            return 0;
        
        if(temp.data==data)
            return level;
            
        return Math.max(getLevel(temp.left,data,level+1),getLevel(temp.right,data,level+1));
    }
    
    int getLevel(Node node, int data)  
    { 
        return getLevel(node,data,1);
    } 
}
