// 

import java.util.Arrays;

public class Solution
{
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in)
    {
       if(in.length==0)
           return null;
        
        BinaryTreeNode<Integer> head=new BinaryTreeNode<Integer>(post[post.length-1]);
        int hi=0;
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==post[post.length-1])
            {
                hi=i;
                break;
            }
        }
        
        int lin[]=Arrays.copyOfRange(in,0,hi);
        int lpost[]=Arrays.copyOfRange(post,0,hi);
        head.left=getTreeFromPostorderAndInorder(lpost,lin);
        int rin[]=Arrays.copyOfRange(in,hi+1,in.length);
        int rpost[]=Arrays.copyOfRange(post,hi,post.length-1);
        head.right=getTreeFromPostorderAndInorder(rpost,rin);
        
        return head;
	}
}