// https://classroom.codingninjas.com/app/classroom/me/1108/content/29649/offering/311626/problem/5885

import java.util.*;

public class Solution
{
    public static void replace(int[] a, int n)
    {
        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(a[a.length-1]);
        a[a.length-1]=-1;
        for(int i=a.length-2;i>=0;i--)
        {
            s.add(a[i]);
            try{
            	int d = s.higher(a[i]);
            }
            catch(Exception e)
            {
            	a[i]=-1;
            }
            if(a[i]!=-1)
            {
            	a[i]=s.higher(a[i]);
            }
        }
    }
}
