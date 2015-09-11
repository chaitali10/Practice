package Recursion;

import java.util.ArrayList;

public class StringPermutations {

	public ArrayList<String> permutations(String s)
	{
		if(s == null || s.length() == 0)
			return null;
		
		ArrayList<String> result = new ArrayList<String>();
		getPermutations(" ", s, result);
		
		return result;
	}
	
	private void printPermutations(String prefix, String suffix)
	{
		if(suffix.length() == 0)
		{
			System.out.println(prefix);
		}
		
		for(int i=0; i<suffix.length(); i++)
		{
			printPermutations(prefix + suffix.charAt(i), 
					suffix.substring(0, i) + suffix.substring(i+1, suffix.length()));
		}
	}
	
	private void getPermutations(String prefix, String suffix, ArrayList<String> result)
	{
		if(suffix.length() == 0)
		{
			result.add(prefix);
		}
		
		for(int i=0; i<suffix.length(); i++)
		{
			getPermutations(prefix + suffix.charAt(i), 
					suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), result);
		}
	}
	
	public ArrayList<String> getPermutations1(String prefix, String suffix)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if(suffix.length() == 0)
		{
			result.add(prefix);
			return result;
		}
		
		for(int i=0; i<suffix.length(); i++)
		{
			ArrayList<String> temp = getPermutations1(prefix + suffix.charAt(i), 
					suffix.substring(0, i) + suffix.substring(i+1, suffix.length()));
			
			result.addAll(temp);
		}
		
		return result;
	}
}
