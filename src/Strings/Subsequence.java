package Strings;

public class Subsequence {
	
	public static boolean isSubSequence(String subSeq, String str)
	{
		int j=0;
		
		for(int i=0; i<str.length() && j<subSeq.length(); i++)
		{
			if(str.charAt(i) == subSeq.charAt(j))
			{
				j++;
			}
		}
		
		if(j == subSeq.length())
			return true;
		
		return false;
	}
}
