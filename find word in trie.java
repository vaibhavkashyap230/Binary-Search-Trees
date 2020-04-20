https://classroom.codingninjas.com/app/classroom/me/1108/content/39592/offering/441226/problem/1652

private static boolean find(TrieNode par,String s)
	{
		if(s.length()==0)
		{
			return par.eow;
		}
		
		if(par.child[s.charAt(0)-97]==null)
			return false;
		
		return find(par.child[s.charAt(0)-97], s.substring(1));
	}
