// https://practice.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1/

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Tree
{
    int check(Node temp,int ans[],int tar)
    {
        if(temp==null)
            return 0;
        
        int left = check(temp.left,ans,tar);
        int right = check(temp.right,ans,tar);
        int sum = left+right+temp.data;
        
        if(sum==tar)
            ans[0]+=1;
        
        return sum;
    }
    int countSubtreesWithSumX(Node root, int X)
    {
        int ans[] = new int[1];
        check(root,ans,X);
        return ans[0];
    }
}
