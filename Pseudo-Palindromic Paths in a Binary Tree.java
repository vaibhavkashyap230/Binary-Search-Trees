// https://leetcode.com/contest/weekly-contest-190/problems/pseudo-palindromic-paths-in-a-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;     
class Solution
{
    private void count(TreeNode temp,HashMap<Integer,Integer> hm,int c[])
    {
        if(temp==null)
            return;
        
        if(hm.containsKey(temp.val))
            hm.put(temp.val,hm.get(temp.val)+1);
        else
            hm.put(temp.val,1);
        
        if(temp.left==null && temp.right==null)
        {
                int oc = 0;
                for (Map.Entry<Integer,Integer> entry : hm.entrySet())
                {
                    if(entry.getValue()%2==1)
                        oc+=1;
                }
                if(oc<2)
                    c[0]+=1;
        }
        
        count(temp.left,hm,c);
        count(temp.right,hm,c);
        
        if(hm.get(temp.val)==1)
            hm.remove(temp.val);
        else
            hm.put(temp.val,hm.get(temp.val)-1);
    }
    
    public int pseudoPalindromicPaths (TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int c[]= new int[1];
        count(root,hm,c);
        return c[0];
    }
}