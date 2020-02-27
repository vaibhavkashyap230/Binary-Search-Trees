// https://classroom.codingninjas.com/app/classroom/me/1108/content/28867/offering/301723/problem/100

import java.util.*;

public class Solution
{
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in)
    {
        if(in.length==0)
            return null;
        
        BinaryTreeNode<Integer> head=new BinaryTreeNode<Integer>(pre[0]);
        
        int hi=0;
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==pre[0])
            {
                hi=i;
                break;
            }
        }
        
        int lin[]=Arrays.copyOfRange(in,0,hi);
        int lpre[]=Arrays.copyOfRange(pre,1,hi+1);
        head.left=getTreeFromPreorderAndInorder(lpre,lin);
        int rin[]=Arrays.copyOfRange(in,hi+1,in.length);
        int rpre[]=Arrays.copyOfRange(pre,hi+1,pre.length);
        head.right=getTreeFromPreorderAndInorder(rpre,rin);
        return head;
	}
}