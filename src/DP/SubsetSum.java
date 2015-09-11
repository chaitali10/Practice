package DP;

import java.util.*;

public class SubsetSum {

	// Find all subsets of an int array whose sums equal a given target
	// assuming for non-negative integers	
	public void subSets(int[] arr, int targetSum, int index, ArrayList<Integer> list)
	{
		if(index > arr.length) return;
		if(targetSum < 0) return;
		
		if(targetSum == 0 && list.size() > 0)
		{
			for(Integer i : list)
			{
				System.out.printf("%s%s", i, " ");
			}
			System.out.println();
		}
	
		for(int i=index; i<arr.length; i++)
		{
			list.add(arr[i]);		
			subSets(arr, targetSum-arr[i], i+1, list);
			list.remove(list.size()-1);
		}	
	}
}
