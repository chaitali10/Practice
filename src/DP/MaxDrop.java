package DP;

public class MaxDrop {

	public void maxDrop(int[] arr)
	{
		if(arr == null)
		{
			throw new IllegalArgumentException("Invalid input");
		}

		int length = arr. length;
		int max = arr[0];
		int[] maxDrop = new int[length];
		maxDrop[0] = 0;

		for(int i=1; i<length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}

			maxDrop[i] = Math.max(maxDrop[i-1], max-arr[i]);
		}

		System.out.println(maxDrop[length-1]);
	}
	
	public void maxDropOptimized(int[] arr)
	{
		if(arr == null)
		{
			throw new IllegalArgumentException("Invalid input");
		}

		int length = arr. length;
		int max = arr[0];
		int maxDrop = Integer.MIN_VALUE; 

		for(int i=1; i<length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}

			maxDrop = Math.max(maxDrop, max-arr[i]);
		}

		System.out.println(maxDrop);
	}	
}
