package Arrays;

public class SortMaxBits {
	
	//Write a function to sort a string based on the number of bits in each character in descending order
	//e.g 
	//z is 122 = 1111010
	//b is 98 = 1100010
	//a is 97 = 1100001
	
	public void sortString(String str)
	{
		if(str == null || str.length() == 0)
		{
			throw new IllegalArgumentException("Input string is invalid");
		}

		char[] charArr = str.toCharArray();
		int length = charArr.length;

		for(int i=0; i < length - 1; i++)
		{
			int minIndexBitCount = getBits(charArr[i]);
			int minIndex = i; 
			
			for(int j=i+1; j < length; j++)
			{
				int bitCount = getBits(charArr[j]);
			
				if(bitCount > minIndexBitCount)
				{
					minIndex = j;
				}
			}

			char temp = charArr[i];
			charArr[i] = charArr[minIndex];
			charArr[minIndex] = temp;
		}
		
		System.out.println(charArr.toString());
	}
	
	public int getBits(char c)
	{
		int result = 0;
	
		switch(c) {
			case 'a': 
				result = 3;
				break;
			case 'b':
				result = 3;
				break;
			case 'z':
				result = 5;
				break;
		}
		
		return result;
	}



}
