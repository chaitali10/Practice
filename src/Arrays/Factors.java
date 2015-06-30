package Arrays;

import java.util.List;
import java.util.TreeSet;

public class Factors {

	// we do square root bec if factors a and b are more than the square root of n
	// then their product would be greater than n
	public static void factors(long n)
	{
		int sqRoot = (int) Math.sqrt(n);
		
		for(int i=1; i<= sqRoot; i++)
		{
			if(n%i == 0)
			{
				System.out.println(i);	
				if(i * i != n)
				{
					System.out.println(n/i);
				}
			}
		}
	}
}
