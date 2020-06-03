// https://www.interviewbit.com/problems/shortest-unique-prefix/

class TrieNode
{
	char data;
	TrieNode child[];
	boolean eow;
	int freq;
	public TrieNode(char x)
	{
		this.data=x;
		this.eow = false;
		this.child = new TrieNode[26];
		this.freq = 0;
	}
}

public class Solution
{
    private void insert(TrieNode par,String s)
	{
		if(s.length()==1)
		{
			TrieNode temp = new TrieNode(s.charAt(0));
			temp.eow =  true;
			temp.freq+=1;
			par.child[s.charAt(0)-'a'] = temp;
			return;
		}
		
		if(par.child[s.charAt(0)-'a']==null)
			par.child[s.charAt(0)-'a'] = new TrieNode(s.charAt(0));
		
		par.child[s.charAt(0)-'a'].freq+=1;
		insert(par.child[s.charAt(0)-'a'],s.substring(1));
	}
	
	private static void prefix(TrieNode temp,String s,ArrayList<String> res,String ans)
	{
		if(temp.freq==1)
		{
		    res.add(ans);
			return;
		}
		

		prefix(temp.child[s.charAt(0)-'a'],s.substring(1),res,ans+s.charAt(0));
	}
	
    public ArrayList<String> prefix(ArrayList<String> a)
    {
        TrieNode root = new TrieNode('\0');
        for(String i : a)
        {
            insert(root,i);
        }
        ArrayList<String> res = new ArrayList<String>();
        for(String i : a)
        {
            prefix(root,i,res,"");
        }
        return res;
    }
}