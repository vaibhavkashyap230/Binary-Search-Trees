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

private static void print(TrieNode temp,String s)
{
	if(temp.eow==true)
	{
		System.out.println(s);
	}
		
	for(int i=0;i<26;i++)
	{
		if(temp.child[i]!=null)
		{
			print(temp.child[i],s+(char)(97+i));
		}
	}
}
