// https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/

import java.math.BigInteger;
public class Solution
{
    private static void srtl(TreeNode temp,String s,BigInteger t[])
    {
        if(temp==null)
            return;
        
        if(temp.left==null && temp.right==null)
        {
            String c = Integer.toString(temp.val);
            BigInteger d = new BigInteger(s+c);
            
            t[0]=t[0].add(d.mod(new BigInteger("1003")));
            return;
        }
        
        String c = Integer.toString(temp.val);
        srtl(temp.left,s+c,t);
        srtl(temp.right,s+c,t);
    }
    public int sumNumbers(TreeNode root)
    {
        BigInteger t[] = new BigInteger[1];
        t[0] = new BigInteger("0");
        srtl(root,"",t);
        BigInteger r = t[0].mod(new BigInteger("1003"));
        return (r.intValue());
    }
}