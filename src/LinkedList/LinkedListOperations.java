package LinkedList;

public class LinkedListOperations<T> {
	
	public LinkedListNode<T> findMidElement(LinkedListNode<T> n)
	{
		if(n == null)
			return null;

		LinkedListNode<T> slow = n;
		LinkedListNode<T> fast = n;

		while(fast != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
