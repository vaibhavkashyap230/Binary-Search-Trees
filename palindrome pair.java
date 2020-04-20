// https://classroom.codingninjas.com/app/classroom/me/1108/content/39592/offering/441233/problem/1656

import java.util.ArrayList;

class TrieNode
{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data)
    {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie
{
	private TrieNode root;
	public int count;
	public Trie()
    {
		root = new TrieNode('\0');
	}

	private void add(TrieNode temp, String s)
    {
        if(s.length()==0)
		{
			temp.isTerminating=true;
			return;
		}
		
		if(temp.children[s.charAt(0)-97]==null)
		{
			temp.children[s.charAt(0)-97] = new TrieNode(s.charAt(0));
		}
		add(temp.children[s.charAt(0)-97],s.substring(1));
	}

	public void add(String word)
    {
		add(root, word);
	}
    
    public String rev(String str)
    {
        char s[] = str.toCharArray();
        int i=0,j=s.length-1;
        while(i<j)
        {
            char d = s[i];
            s[i] = s[j];
            s[j] = d;
            i+=1;
            j-=1;
        }
        return String.valueOf(s);
    }
    
    public boolean find(TrieNode par,String s)
    {
        if(s.length()==0)
            return true;
        
        if(par.children[s.charAt(0)-97]==null)
            return false;
        
        return find(par.children[s.charAt(0)-97],s.substring(1));
    }
    
	public boolean findPalindromePair(ArrayList<String> vect)
    {
        for(String s : vect)
        {
            add(s);
        }
        for(String s : vect)
        {
            String rev = rev(s);
            if(find(root,rev))
                return true;
        }
        return false;
	}

}