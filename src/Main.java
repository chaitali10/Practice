import java.util.ArrayList;

import Strings.NestedParenthesis;
import Trees.Node;
import Trees.PrintTrees;
import Trees.Tries;
import Trees.TriesHashMap;
import Arrays.Duplicates;
import Arrays.Factors;
import Arrays.FindSmallestKNumbers;
import Arrays.Numbers;
import Arrays.Pow;
import Arrays.Primes;
import Arrays.SpiralMatrix;
import Arrays.Triangles;
import Arrays.TwoSum;
import Arrays.UniqueElements;
import DP.MaxSum;


public class Main {

	public static void main(String[] args) {
		
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
