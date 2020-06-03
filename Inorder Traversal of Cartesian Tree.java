// https://www.interviewbit.com/problems/inorder-traversal-of-cartesian-tree/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution
{
    public TreeNode buildTree(ArrayList<Integer> a)
    {
        if(a.size()==0)
			return null;
		
		int max = 0;
		for(int i=1;i<a.size();i++)
		{
			if(a.get(i)>a.get(max))
				max = i;
		}
		
		TreeNode temp = new TreeNode(a.get(max));
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<max;i++)
		{
			l.add(a.get(i));
		}
		temp.left = buildTree(l);
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i=max+1;i<a.size();i++)
		{
			r.add(a.get(i));
		}
		temp.right = buildTree(r);
		return temp;
    }
}