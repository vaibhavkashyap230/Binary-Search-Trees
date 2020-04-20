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

private static void insert(TrieNode temp,String s)
	{
		if(s.length()==0)
		{
			temp.eow=true;
			return;
		}
		
		if(temp.child[s.charAt(0)-97]==null)
		{
			temp.child[s.charAt(0)-97] = new TrieNode(s.charAt(0));
		}
		insert(temp.child[s.charAt(0)-97],s.substring(1));
	}
