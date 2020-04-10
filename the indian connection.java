// https://docs.google.com/document/d/1NxZMdBo1h7aeeq0pMAzV7DOFpFaUCLvjf9vYe1uTbK8/edit

import java.util.*;

public class Solution
{
	private static boolean findsex(long k,int n)
	{
		if(n==1 || k==0)
			return true;
		
		long pi = k/2;
		boolean ps = findsex(pi,n-1);
		if(k==2*pi)
			return ps;
		return !ps;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			long k = s.nextInt();
			boolean r= findsex(k-1,n);
			if(r)
			{
				System.out.println("Male");
			}
			else
			{
				System.out.println("Female");
			}
		}
		s.close();
	}
}