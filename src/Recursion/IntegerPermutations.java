package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerPermutations {

	public void getPermutations(int[] arr)
	{
		if(arr == null || arr.length == 0)
			return;
		
		int[] temp = Arrays.copyOf(arr, arr.length);        
	    printAll(0,temp);
	}

	private void printAll(int index,int[] temp) 
	{
	    if(index == temp.length - 1) 
	    {
	    	System.out.println(Arrays.toString(temp));
	    }           
	    else 
	    {
	        for(int i=index;i<temp.length;i++) 
	        {
	        	swap(temp,index,i);
	            printAll(index+1, temp);             
	            swap(temp,index,i);
	        }       
	    }
	}   

	private void swap(int[] arr, int i, int j) 
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j]  = temp;
	}  
}
