// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5890

import java.util.*;

public class Solution
{
    private static int sumk(Node temp,int c[])
    {
        if(temp==null)
        {
            return 0;
        }
        
        int s = sumk(temp.left,c);
        c[0]-=1;
        if(c[0]>=0)
        {
            s+=temp.data;
        }
        s+=sumk(temp.right,c);
        return s;
    }
	public static int solve(Node root, int k)
    {
        int c[]={k};
        return sumk(root,c);
	}
}