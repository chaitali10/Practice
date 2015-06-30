package LinkedList;

public class LinkedListNode<T> {

	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data, LinkedListNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
}
