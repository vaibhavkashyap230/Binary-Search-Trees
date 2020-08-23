// https://practice.geeksforgeeks.org/problems/find-the-distance-between-two-nodes/0/

import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
     	Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int a = sc.nextInt(), b = sc.nextInt(), count = 0;
            while(a!=b)
            {
                while(a>b)
                {
                    a/=2;
                    count++;
                }
                while(b>a)
                {
                    b/=2;
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
	 }
}
