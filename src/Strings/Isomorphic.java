package Strings;

import java.util.HashMap;

public class Isomorphic {

	public boolean isIsoMorphic(String s1, String s2)
	{
		if(s1 == null || s2 == null)
			throw new IllegalArgumentException("Strings are null");
		
		if(s1.length() != s2.length())
			throw new IllegalArgumentException("Strings are not of same length");
		
		if(s1.length() == 0)
			throw new IllegalArgumentException("Either of both strings are of length 0");
		
		if(s1.length() == 1)
			return true;
		
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		for(int i=0; i<s1.length();i++)
		{
			if(charMap.containsKey(s1.charAt(i)))
			{
				if(s2.charAt(i) != charMap.get(s1.charAt(i)))
				{
					return false;
				}
			}
			else if(charMap.containsValue(s2.charAt(i)))
			{
				return false;
			}
			
			charMap.put(s1.charAt(i), s2.charAt(i));
		}
		
		return true;
	}
}
