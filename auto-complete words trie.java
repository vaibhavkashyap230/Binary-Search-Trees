// https://classroom.codingninjas.com/app/classroom/me/1108/content/39592/offering/441233/problem/1654

import java.util.*;

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
	
	public Trie()
    {
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
	
    public void printall(TrieNode par,String s)
    {
        if(par.isTerminating)
        {
            System.out.println(s);
        }
        
        for(int i=0;i<26;i++)
        {
            if(par.children[i]!=null)
                printall(par.children[i],s+(char)(97+i));
        }
    }
    
	public void printall(TrieNode par,String s,int i)
    {
        if(i>=s.length())
        {
            printall(par,s);
            return;
        }
        
        if(par.children[s.charAt(i)-97]==null)
            return;
        
        printall(par.children[s.charAt(i)-97],s,i+1);
    }
    
	public void autoComplete(ArrayList<String> input, String word)
    {
        for(String s : input)
        {
            add(s);
        }
        printall(root,word,0);
	}
}