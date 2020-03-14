// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5889

import java.util.*;

public class Solution
{
    private static Node tfpo(ArrayList<Integer> a,Node par)
    {
        if(a.size()==0)
            return null;
        
        Node temp = new Node(a.get(0),null,null);
        temp.parent=par;
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i)<a.get(0))
                l.add(a.get(i));
            else
                r.add(a.get(i));
        }
        temp.left=tfpo(l,temp);
        temp.right=tfpo(r,temp);
        return temp;
    }
	public static Node solve(int[] a)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : a)
        {
            if(i!=-1)
            al.add(i);
        }
        return tfpo(al,null);
	}
}