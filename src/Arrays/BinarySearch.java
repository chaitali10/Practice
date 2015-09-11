package Arrays;

public class BinarySearch {

	//Find the first element in an array that is greater than the target
	public int findElement(int[] arr, int target)
	{
		if(arr == null || arr.length == 0)
			throw new IllegalArgumentException("Input array is null or empty");
		
		if(target > arr[arr.length - 1])
			throw new IllegalArgumentException("Array does not contain element greater than target");
			
		if(arr.length == 1)
		{
			if(arr[0] > target) 
				return arr[0];
			else
				throw new IllegalArgumentException("Array does not contain element greater than target");
		}
	
		int index = binarySearch(arr, target);
		
		if(index < 0)
		{
			return arr[-index - 1];
		}
		else
		{
			return arr[index + 1];
		}
	}
	
	
	public int binarySearch(int[] arr, int target)
	{
		int start = 0, end = arr.length - 1;
		int mid = 0;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		
		return -(start + 1);
	}
}
