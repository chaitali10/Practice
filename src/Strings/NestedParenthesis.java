package Strings;

public class NestedParenthesis {

	/**
     * Count the maximum depth of parenthesis nesting, i.e. "abc(123(xyz))m(((n)))o" -> 3.
     * @param input any string
     * @return deepest parenthesization level
     * @throws IllegalArgumentException
     *             if input is null or contains a mismatch "a)b(c" or "a(b"
     */
	
	public static int findDepth(String str)
	{
		if(str == null)
			throw new IllegalArgumentException("Input string cannot be null");
		
		if(str.length() == 0)
			throw new IllegalArgumentException("Input string cannot be empty");
		
		int currentDepth = 0, maxDepth = 0;
		
		for(int i=0; i < str.length(); i++)
		{
			if(str.charAt(i) == '(')
			{
				currentDepth++;
			}
			else if(str.charAt(i) == ')')
			{
				if(currentDepth == 0)
				{
					throw new IllegalArgumentException("Input string is not correct");
				}
				
				if(currentDepth > maxDepth)
				{
					maxDepth = currentDepth;
				}
				
				currentDepth--;
			}
		}
		
		if(currentDepth != 0)
		{
			throw new IllegalArgumentException("Input string is not correct");
		}
		
		return maxDepth;
	}
}
