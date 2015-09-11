package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {

	/*
	 * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers 
	 * appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.
	 * For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
	*/
	
	public void findDuplicates(int[] arr)
	{
		if(arr == null)
		{
			System.out.println("Array is null");
			return;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[Math.abs(arr[i])] > 0)
			{
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}
			else
			{
				System.out.println(Math.abs(arr[i]));
			}
		}
	}
	
	// Remove duplicates from an array
	public int[] removeDuplicates(int[] arr)
	{
		if(arr == null)
		{
			throw new IllegalArgumentException("Invalid input");
		}
			
		int current = 0, next = 1;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[current] == arr[next])
			{
				next++;
			}
			else
			{
				current++;			
				if(current != next)
				{
					arr[current] = arr[next];
				}
				next++;
			}
		}

		int[] newArr = Arrays.copyOf(arr, current + 1);
		return newArr;
	}
	
	
	//// Remove duplicates in 2 arrays
	public void findUniqueElements(int[] A, int[] B)
	{
		if(A == null && B == null)
			return;

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap = getUniqueElements(A, hashMap);
		hashMap = getUniqueElements(B, hashMap);

		Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet();
		for(Entry e : set)
		{
			if((int)e.getValue() == 1)
			{
				System.out.println(e.getKey());
			}
		}
	}

	public HashMap<Integer, Integer> getUniqueElements(int[] arr, HashMap<Integer, Integer> hashMap)
	{
		for(int i=0; i < arr.length; i++)
		{
			int temp = 0;
			if(hashMap.containsKey(arr[i]))
			{
				temp = hashMap.get(arr[i]);
			}
			
			hashMap.put(arr[i], temp + 1);
		}
		
		return hashMap;	
	}
}
