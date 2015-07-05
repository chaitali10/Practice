package Arrays;

public class RotatedArray {

	//Given a sorted array of n integers, find an element in the array. Assume array was sorted in increasing order

	public int findElement(int[] arr, int x)
	{
		if(arr == null || arr. length == 0)
			throw new IllegalArgumentException("Input array is null or empty");

		int start = 0, end = arr.length -1;

		while(start <= end)
		{
			int mid = (start + end)/2;
					
			if(arr[mid] == x)
			{
				return mid;
			}
			// left side is ordered
			else if(arr[start] <= arr[mid])
			{
				if(x >= arr[start] && x < arr[mid])
				{
					end = mid -1;	
				}
				else
				{
					start = mid + 1;
				}
			}
			// right side is ordered
			else
			{
				if(x > arr[mid] && x <= arr[end])
				{
					start = mid + 1;
				}
				else
				{
					end = mid - 1;
				}
			}
		}
		
		return -1;					
	}
}

