import java.util.ArrayList;
import java.util.Arrays;

import Stacks.ReversePolishNotation;
import Strings.JustifyText;
import Strings.NestedParenthesis;
import Trees.Node;
import Trees.PrintTrees;
import Trees.Tries;
import Trees.TriesHashMap;
import Arrays.BinarySearch;
import Arrays.Duplicates;
import Arrays.Factors;
import Arrays.FindSmallestKNumbers;
import Arrays.MoveNonZeros;
import Arrays.Numbers;
import Arrays.Pow;
import Arrays.Primes;
import Arrays.RotatedArray;
import Arrays.SpiralMatrix;
import Arrays.Triangles;
import Arrays.TwoSum;
import Arrays.UniqueElements;
import Backtracking.SubsetSum;
import Recursion.IntegerPermutations;
import Recursion.KSum;
import Recursion.StringPermutations;
import Recursion.perm;
import DP.LCS;
import DP.MaxDrop;
import DP.MaxSum;


public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 11, 2, 8, 10, 9  };
		//SubsetSum s = new SubsetSum();
		//s.subSets(arr, 0, 19, 0, new ArrayList<Integer>());
		//s.subSets(arr, 19, 0, new ArrayList<Integer>());
		
		
		//int[] arr = new int[] { 11, -5, 9, 6, 40  };
		//int[] arr = new int[] { -5, 6, 9, 11, 40  };
		//KSum k = new KSum();
		//k.hasSum(arr, 4, 55, 0, 0, new ArrayList<Integer>());
		
		//int[] arr = new int[] { 40, 6, 1, 9, -5};
		//int[] arr = new int[] { -5, 9, 6, 11, 40 };
		
		/*int[] arr = new int[] { -5, 9, 6, 9, 40 };
		
		MaxDrop m = new MaxDrop();
		m.maxDrop(arr);
		m.maxDropOptimized(arr);
		
		
		/*int[] arr1 = new int[] { 5, 2, 6, 11, 1 };
		int[] arr2 = new int[] { 2, 1, 4, 5};
		
		Duplicates d = new Duplicates();
		d.findUniqueElements(arr1, arr2);
		
		
		/*LCS l = new LCS();
		l.longestCommonSubsequence("bdcaba", "abcbdab");
		
		//l.longestCommonSubsequence("abcdaf", "acbcf");
		
		/*int[] arr = new int[] { 0, 5, 1, 2, 0, 1, 0 };
		
		MoveNonZeros m = new MoveNonZeros();
		m.moveZeros(arr);
		
		/*perm p = new perm();
		p.permutationFinder("cat");
		
		/*String str = "hello";
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(1, str.length()));
		
		/*String[] str = new String[] { "2", "1", "+", "3", "*", "*" };
		
		ReversePolishNotation r = new ReversePolishNotation();
		System.out.println(r.RPN(str));
		
		/*int[] arr = new int[] { 5, 1, 2 };
		IntegerPermutations p = new IntegerPermutations();
		p.getPermutations(arr);
		
		/*int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		boolean check = false;
		
		if((a + b) > Integer.MAX_VALUE)
			check = true;
		
		System.out.println(check);
		
		/*Factors f  = new Factors();
		f.factors(20);
		
		/*JustifyText j = new JustifyText();
		j.justify("Amazon.com, Inc. is an American electronic commerce company with headquarters in Seattle, Washington. It is the largest Internet-based retailer in the United States.[12] Amazon.com started as an online bookstore, but soon diversified, selling DVDs, Blu-rays, CDs, video downloads, MP3 streaming, software, video", 20);
		
		
		/*int[] arr = new int[] { 5, 1, 2 };
		IntegerPermutations p = new IntegerPermutations();
		p.getPermutations(arr);
		
		/*StringPermutations p = new StringPermutations();
		ArrayList<String> res = p.getPermutations1(" ", "hat");
		
		for(String s : res)
		{
			System.out.println(s);
		}
		
		/*int[] arr = new int[] {15, 16, 19, 20, 25 };
		
		BinarySearch b = new BinarySearch();
		System.out.println(b.findElement(arr, 33));
		
		//system.out.println(b.findElement(arr, 17));
		
		//BinarySearch b = new BinarySearch();
		
		//system.out.println(b.findElement(arr, 17));
		
		
		/*int[] arr = new int[] {15, 16, 19, 20, 25, 1, 3, 5, 14 };
		
		RotatedArray r = new RotatedArray();
		System.out.println(r.findElement(arr, 16));
		
		
		Node n = new Node(10);
		n.left = new Node(7);
		n.right = new Node(12);
		
		PrintTrees p = new PrintTrees();
		p.printLevelByLevel(n);
		
		
		/*Tries trie = new Tries();
		TriesHashMap t = new TriesHashMap();
		
		trie.insert("dog");
		t.insert("cat");
		
		System.out.println(trie.getAllWords());
		System.out.println(t.getAllWords());
		
		System.out.println(trie.search("cat"));
		System.out.println(t.search("cat"));*/
		
		
		/*Factors f = new Factors();
		f.factors(30);
		
		int[] arr = new int[] {-2, 0, 1, 2, 5, 8, 11};
		
		TwoSum t = new TwoSum();
		int[] res = t.twoSum(arr, 9);
		
		for(int i=0; i<2; i++)
		{
			System.out.println(res[i]);
		}
		
		//System.out.println((1 & 2));
		
		/*Pow p = new Pow();
		System.out.println(p.powOptimized(2, 6));	
		
		/*long startTime = System.nanoTime();		
		System.out.println(p.pow(2, -1));	
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
		startTime = System.nanoTime();	
		System.out.println(p.powOptimized(-2, 3));
		System.out.println(p.powOptimized(2, -3));
		endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
		//int a = 3;
		//System.out.println(a >> 1);
		
		// TODO Auto-generated method stub
		/*String s = new String("abc");
		
		ArrayList a = new ArrayList();
		a.add(s);
		
		System.out.println(a.get(0));
		System.out.println(s);
		
		s = "xyz"; //new String("abc");		
		System.out.println(a.get(0));
		System.out.println(s);
		
		//Primes p = new Primes();
		//p.findPrimes(20);
		
		//int[] arr = { 1, 2, 3, 1, 3, 6, 6};
		//Duplicates d = new Duplicates();
		//d.findDuplicates(arr);
		
		/*FindSmallestKNumbers k = new FindSmallestKNumbers();
		k.findSmallest2Numbers(arr);*/
		
		/*Integer a = 1;
		String b = "1";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());*/
		
		/*int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(MaxSum.maxSum(arr));
		
		int[][] matrix = 
		{
				{0, 1, 2},
				{5, 4, 3},
				{6, 7, 8}
		};
		
		SpiralMatrix.printMatrix(matrix);
		
		//System.out.println(NestedParenthesis.findDepth("abc(123(xyz))m(((n)))o"));
		
		/*int[] arr1 = {5, 4, 7, 2, 3, 1 };
		int[] arr2 = {3, 5, 1};
		
		UniqueElements arrTest = new UniqueElements();
		arrTest.findUniqueElements(arr1, arr2);	*/
	}
}
