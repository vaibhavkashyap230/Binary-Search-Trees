// https://classroom.codingninjas.com/app/classroom/me/1108/content/39592/offering/441233/problem/1655

import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie
{
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word)
    {
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word)
    {
		add(root, word);
	}
	
	private boolean find(TrieNode par,String s)
    {
        if(s.length()==0)
        {
            return true;
        }
        
        if(par.children[s.charAt(0)-97]==null)
            return false;
        return find(par.children[s.charAt(0)-97],s.substring(1));
    }
    
	public boolean patternMatching(ArrayList<String> input, String x)
    {
        for(String s : input)
        {
            for(int i=0;i<s.length();i++)
            {
                add(s.substring(i));
            }
        }
        
        return find(root,x);
	}
}