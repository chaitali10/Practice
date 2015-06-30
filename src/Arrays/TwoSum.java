package Arrays;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] arr, int sum)
	{
		if(arr == null || arr. length == 0 || arr. length == 1)
			return null;

		Arrays.sort(arr);

		int leftIndex = 0, rightIndex = arr.length - 1;
		int[] result = new int[2];
		
		while(leftIndex <= rightIndex)
		{
			if(arr[leftIndex] + arr[rightIndex] > sum)
			{
				rightIndex--;
			}
			else if(arr[leftIndex] + arr[rightIndex] < sum)
			{
				leftIndex++;
			}
			else
			{
				result[0] = arr[leftIndex];
				result[1] = arr[rightIndex];
				return result;
			}
		}

		return null;
	}
}
