package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTrees {

	public void printTreeNodes(Node root)
	{
		if(root == null)
		return;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			Node node = queue.remove();
	
			System.out.print(node.data + " ");
	
			if(node.left != null)
			{
				queue.add(node.left);
			}
	
			if(node.right != null)
			{
				queue.add(node.right);
			}
		}		
	}
	
	// Print tree nodes on a new line for each level
	public void printLevelByLevel(Node root)
	{
		if(root == null)
		return;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			int nodesCount = queue.size();
			
			while(nodesCount > 0)
			{
				Node node = queue.remove();
				
				System.out.print(node.data + " ");
				
				if(node.left != null)
				{
					queue.add(node.left);
				}
		
				if(node.right != null)
				{
					queue.add(node.right);
				}
				
				nodesCount--;			
			}
			
			System.out.println(" ");
		}		
	}
}
