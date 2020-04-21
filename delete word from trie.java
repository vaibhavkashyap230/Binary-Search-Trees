//public class TrieNode
//{
//	char data;
//	TrieNode child[];
//	boolean eow;
//	public TrieNode(char x)
//	{
//		this.data=x;
//		this.eow = false;
//		this.child = new TrieNode[26];
//	}
//}

private static void delete(TrieNode par,String s)
{
	if(s.length()==0)
	{
		par.eow = false;
		return;
	}
		
	if(par.child[s.charAt(0)-97]==null)
		return;
		
	delete(par.child[s.charAt(0)-97],s.substring(1));
		
	if(par.child[s.charAt(0)-97].eow==true)
		return;
	boolean f = false;
	for(int i=0;i<26;i++)
	{
		if(par.child[s.charAt(0)-97].child[i]!=null)
		{
			f = true;
			break;
		}
	}
	if(f)
		par.child[s.charAt(0)-97]=null;
}