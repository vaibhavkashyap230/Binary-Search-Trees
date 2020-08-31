// https://practice.geeksforgeeks.org/problems/preorder-traversal-and-bst/0

import java.util.*;

class GFG
 {
    private static boolean check(int a[],int s,int e)
    {
        if(s>e)
            return true;
        
        int temp = -1;
        for(int i=s+1;i<=e;i++)
        {
            if(a[i]>a[s])
            {
                temp = i;
                break;
            }
        }
        if(temp==-1)
            return check(a,s+1,e);
        
         for(int i=temp;i<=e;i++)
         {
             if(a[i]<a[s])
                 return false;
         }
        
        return check(a,s+1,temp-1) && check(a,temp,e);
    }
    
	public static void main (String[] args)
	 {
     	Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
            if(check(a,0,a.length-1))
                System.out.println(1);
            else
                System.out.println(0);
        }
        sc.close();
	}
}
