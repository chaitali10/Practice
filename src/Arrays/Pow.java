package Arrays;

public class Pow {
	
	// Brute force
	// Takes O(n)
	public double pow(double x, int y)
	{
		if(x == 0) return 0;
		if(y == 0) return 1;
		if(x == 1) return 1;
		if(y == 1) return x;

		double result = 1;

		if(y < 0)
		{
			x = 1/x;
			y = -y;
		}

		for(int i = 1; i <= y; i++)
		{
			if(result * x < Double.MAX_VALUE)
			{
				result *= x;
			}
		}
		
		return result;
	}
	
	// Optimized
	// Takes log n
	public double powOptimized(double x, int y)
	{
		if(x == 0) return 0;
		if(y == 0) return 1;
		if(x == 1 || y == 1) return 1;
		
		if(y < 0) 
		{
			x = 1/x;
			y = -y;
		}
		
		double result = 1;
		if((y & 1) == 1) result = x;

		while(true)
		{
			y >>= 1;
			if(y == 0) break;
			x *= x;
			if((y & 1) == 1) result *= x;
		}
		
		return result;
	}
	
	// Optimized
	// Takes log n
	public double powRecursive(double x, int y)
	{
		return 0;
	}
}
