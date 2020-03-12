// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5881

public class Solution
{
    public static BinaryTreeNode<Integer> constructBST(int[] pre)
    {
        if(pre.length==0)
            return null;
        if(pre.length==1)
        {
            return (new BinaryTreeNode<Integer>(pre[0]));
        }
        
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(pre[0]);
        int rs=-1;
        for(int i=1;i<pre.length;i++)
        {
            if(pre[i]>pre[0])
            {
                rs=i;
                break;
            }
        }
        if(rs==-1)
        {
            rs=pre.length;
        }
        int l[] = new int[rs-1];
        for(int i=1;i<rs;i++)
        {
            l[i-1]=pre[i];
        }
        int r[] = new int[pre.length-l.length-1];
        for(int i=rs;i<pre.length;i++)
        {
            r[i-rs]=pre[i];
        }
        temp.left = constructBST(l);
        temp.right = constructBST(r);
        return temp;
    }
}