package Arrays;

public class FindSmallestKNumbers {

	public void findSmallest2Numbers(int[] arr)
	{
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < smallest)
			{
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest && arr[i] > smallest)
			{
				secondSmallest = arr[i];
			}
		}
		
		System.out.println(smallest);
		System.out.println(secondSmallest);
	}
}
