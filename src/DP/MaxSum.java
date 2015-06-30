package DP;

public class MaxSum {
	
	public static int maxSum(int[] arr)
	{
		int maxSum = 0;
		int[] sum = new int[arr.length];
		sum[0] = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			sum[i] = Math.max(arr[i] + sum[i - 1], arr[i]);
			maxSum = Math.max(maxSum, sum[i]);
		}
		
		return maxSum;
	}
}
