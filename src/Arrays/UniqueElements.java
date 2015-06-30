package Arrays;
import java.util.HashSet;

public class UniqueElements {
	
	// ServiceNow
	// Given 2 arrays, find unique elements

	public void findUniqueElements(int[] arr1, int[] arr2)
	{
		if(arr1 == null && arr2 == null)
			throw new IllegalArgumentException();
		
		HashSet<Integer> uniqueElements = new HashSet<Integer>();
		findUniqueElements(arr1, uniqueElements);
		findUniqueElements(arr2, uniqueElements);
		
		for(Integer i : uniqueElements)
		{
			System.out.println(i);
		}
	}
	
	private void findUniqueElements(int[] arr, HashSet<Integer> uniqueElements)
	{
		for(int i=0; i < arr.length; i++)
		{
			if(uniqueElements.contains(arr[i]))
			{
				uniqueElements.remove(arr[i]);
			}
			else
			{
				uniqueElements.add(arr[i]);
			}
		}
	}
}
