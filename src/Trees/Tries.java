package Trees;

import java.util.ArrayList;
import java.util.List;

public class Tries {

	public class TrieNode
	{
		Character c;
		boolean isWord;
		TrieNode[] children;
		
		public TrieNode()
		{
			isWord = false;
			children = new TrieNode[26];
		}
		
		public TrieNode(char c)
		{
			this();
			this.c = c;
		}
	}
	
	TrieNode root;
	
	public Tries()
	{
		root = new TrieNode();
	}
	
	public void insert(String word)
	{	
		if(word == null || word.length() == 0)
		{
			throw new IllegalArgumentException("Input string is null or empty");
		}
		
		TrieNode temp = root;
		
		for(int i=0; i<word.length();i++)
		{
			int index = word.charAt(0) - 'a';			
			if(temp.children[index] == null)
			{
				temp.children[index] = new TrieNode(word.charAt(i));
			}
			temp = temp.children[index];
		}
		
		temp.isWord = true;
	}
	
	public boolean search(String word)
	{
		if(word == null || word.length() == 0)
		{	
			throw new IllegalArgumentException("Input string is null or empty");		
		}
		
		List<String> words = new ArrayList<String>();
		TrieNode temp = root;
		
		for(int i=0; i < word.length(); i++)
		{
			int index = word.charAt(i) - 'a';
			temp = temp.children[index];
			
			if(temp == null)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public List<String> getAllWords()
	{
		return getAllWords("", root);
	}
	
	
	public List<String> getAllWords(String s, TrieNode root)
	{
		List<String> words = new ArrayList<String>();
		
		if(root.isWord)
		{
			words.add(s);
			return words;
		}
		
		TrieNode temp = root;
		for(int i=0; i<temp.children.length; i++)
		{
			if(temp.children[i] != null)
			{
				words.addAll(getAllWords(s + temp.c, temp.children[i]));
			}
		}
		
		return words;
	}
}
