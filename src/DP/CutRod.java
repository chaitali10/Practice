package DP;

public class CutRod {

	public int cutRodTopDown(int[] p, int n)
	{
		if(n <= 0) return 0;
		if(n == 1) return p[1];
		
		int profit = 0;
		for(int i=1; i<=n; i++)
		{
			profit = Math.max(p[n], p[i] + cutRodTopDown(p, n-i));
		}
		
		return profit;
	}
	
	public int cutRodTopDownMemoized(int[] p, int n, int[] r)
	{
		if(r[n] != Integer.MIN_VALUE) return r[n];
		
		if(n <= 0) return 0;
		if(n == 1) return 1;
		
		int profit = 0;
		for(int i=1; i<=n; i++)
		{
			profit = Math.max(p[n], p[i] + cutRodTopDownMemoized(p, n-i, r));
		}
		
		r[n] = profit;
		return profit;
	}
	
	public int cutRodBottomUp(int[] p, int n)
	{
		if(n <= 0) return Integer.MIN_VALUE;
		
		int[] result = new int[n];
		result[0] = 0;
		
		for(int i=1; i<=n; i++)
		{
			int profit = 0;
			for(int j=1; j<=i; j++)
			{
				profit = Math.max(profit, result[j] + result[i-j]);
			}
			result[i] = profit;
		}
		
		return result[n];
	}
}
