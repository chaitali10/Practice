package Strings;

public class Duplicates {

	public void findRepeatingChars(String str)
	{
		if(str == null)
			return;

		byte[] arrCount = new byte[256];
		
		for(int i=0; i < str.length(); i++)
		{
			if(arrCount[str.charAt(i)] == 0)
			{
				arrCount[str.charAt(i)] = 1;
			}
			else
			{
				System.out.println(str.charAt(i));
			}
		}
	}
	
	

}
