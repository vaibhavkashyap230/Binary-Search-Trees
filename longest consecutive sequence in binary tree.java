// https://www.interviewbit.com/problems/longest-consecutive-sequence-in-binary-tree/#

public class Solution
{
    private static void lcs(TreeNode temp,int last,int c[],int cc)
    {
        if(temp==null)
            return;
            
        if(temp.val==last+1)
        {
            cc+=1;
        }
        else
        {
            cc=1;
        }
        if(cc>c[0])
            c[0]=cc;
            
        lcs(temp.left,temp.val,c,cc);
        lcs(temp.right,temp.val,c,cc);
    }
    public int solve(TreeNode root)
    {
        if(root==null)
            return 0;

        int c[] = new int[1];
        c[0]=1;
        lcs(root.left,root.val,c,1);
        lcs(root.right,root.val,c,1);
        return c[0];
    }
}