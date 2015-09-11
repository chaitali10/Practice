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
	
	public static int maxSum2(int[] arr)
	{
		if(arr == null || arr.length == 0)
			throw new IllegalArgumentException("Input incorrect");
		
		int maxSum = arr[0], currMaxSum = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			currMaxSum = Math.max(currMaxSum, currMaxSum + arr[i]);
			maxSum = Math.max(maxSum, currMaxSum);
		}
		
		return maxSum;
	}
}
