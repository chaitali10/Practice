package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Trees.Tries.TrieNode;

// Assuming strings are in lower case
public class TriesHashMap {
	
	public class TrieNode
	{
		Character c;
		boolean isWord;
		HashMap<Character, TrieNode> children;
		
		public TrieNode()
		{
			isWord = false;
			children = new HashMap<Character, TrieNode>();
		}
		
		public TrieNode(Character c)
		{
			this();
			this.c = c;
		}
	}
	
	TrieNode root;
	
	public TriesHashMap()
	{
		root = new TrieNode();
	}

	public void insert(String word)
	{
		if(word == null || word.length() == 0)
		{
			throw new IllegalArgumentException("Input string is null or empty");
		}
		
		HashMap<Character, TrieNode> temp = root.children;
		TrieNode t = null;
		
		for(int i=0; i<word.length(); i++)
		{
			if(temp.containsKey(word.charAt(i)))
			{
				t = temp.get(word.charAt(i));
			}
			else
			{
				t = new TrieNode(word.charAt(i));
				temp.put(word.charAt(i), t);
			}
			
			temp = t.children;
		}
		
		if(t != null)		
		{
			t.isWord = true;
		}
	}
	
	public boolean search(String word)
	{
		if(word == null || word.length() == 0)
		{
			throw new IllegalArgumentException("Input string is null or empty");
		}
		
		HashMap<Character, TrieNode> temp = root.children;
		TrieNode t = null;
		
		for(int i=0; i<word.length(); i++)
		{
			if(temp.containsKey(word.charAt(i)))
			{
				t = temp.get(word.charAt(i));
			}
			else
			{
				return false;
			}
		}
		
		if(t != null && t.isWord)
		{
			return true;
		}
		
		return false;
	}
	
	public List<String> getAllWords()
	{
		return getAllWords("", root);
	}
	
	private List<String> getAllWords(String s, TrieNode root)
	{
		List<String> words = new ArrayList<String>();
	
		if(root.isWord)
		{
			words.add(s);
			return words;
		}
		
		HashMap<Character, TrieNode> temp;
		for(Map.Entry<Character, TrieNode> t: root.children.entrySet())
		{
			words.addAll(getAllWords(s + t.getKey(), t.getValue()));
		}
		
		return words;
	}
}
