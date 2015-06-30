package Strings;

public class Reverse {
	
	public void ReverseWords(String str)
	{
		if(str == null)
			return;
		
		String[] s = str.split(" ");
		StringBuilder output = new StringBuilder();
		
		for(int i= s.length-1; i>=0; i++)
		{
			output.append(s[i]);
		}
		
		System.out.println(output.toString());
	}
}
