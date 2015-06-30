package Trees;

public class FindElements {
	
	public void printElements(Node root, int k1, int k2)
	{
		if(root == null)
			return;

		printElements(root.left, k1, k2);
		
		if(root.data >= k1 && root.data <= k2)
		{
			System.out.println(root.data);
		}

		printElements(root.right, k1, k2);
	}

	public void printElementsOptimized(Node root, int k1, int k2)
	{
		if(root == null)
			return;
		
		if(root.data >= k1)
		{
			printElements(root.left, k1, k2);
		}

		if(root.data >= k1 && root.data <= k2)
		{
			System.out.println(root.data);
		}

		if(root.data <= k2)
		{
			printElements(root.right, k1, k2);
		}
	}
}
