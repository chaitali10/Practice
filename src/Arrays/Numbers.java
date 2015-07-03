package Arrays;

public class Numbers {

	/*-$100,00
	$-201.56
	$-,1*/
	
	// need to check for arithmematic overflow??
	public boolean isNumber(String s)
	{
			if(s == null || s.length() == 0)
				throw new NumberFormatException();
			
			int i = 0, len = s.length() - 1;
			char c = s.charAt(i);

			while(true)
			{
				if(c == '$' || c == '-')
				{
					c = s.charAt(++i);
				}
				else
				{
					break;
				}
			}

			if(c == ',')
			{
				return false;
			}

			while(i < len)
			{
				if(c >= '0' && c <= '9' || c == ',' || c =='.')
				{
					c = s.charAt(++i);
				}
				else
				{
					return false;
				}								
			}

			return true;
	}
}

