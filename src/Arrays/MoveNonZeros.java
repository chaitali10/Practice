package Arrays;

public class MoveNonZeros {

	public void moveZeros(int[] arr)
	{
		if(arr == null || arr. length == 0)
			throw new IllegalArgumentException("Input is invalid");

		int start = 0, end = arr. length - 1;

		while(arr[start] == 0)
		{
			start++;
		}

		while(start != end)
		{
			if(arr[end] == 0)
			{
				arr[end] = arr[start];
				arr[start++] = 0;
			}

			end--;
		}
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
