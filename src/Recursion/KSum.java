package Recursion;

import java.util.List;

public class KSum {
	
	public boolean hasSum(int[] arr, int k, int sum, int currentSum, int index, List<Integer> list)
	{
		if(k < 0) return false;
		if(currentSum > sum) return false;		
		if(index > arr.length - 1) return false;
		
		if(k==0) {
			if(currentSum == sum) {
				for(Integer i : list) {
					System.out.println(i);
				}				
				return true;
			}
			else {
				return false;
			}
		}
				
		boolean result = false;
		for(int i= index; i < arr.length; i++)
		{	
			list.add(arr[i]);
			result = hasSum(arr, k-1, sum, currentSum + arr[i], index + 1, list);
				
			if(!result)
			{
				list.remove(index);
			}
			else
			{
				return result;
			}
		}
		
		return result;
	}
}
