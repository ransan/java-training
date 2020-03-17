package linked_list;

public class LinkedListDriver {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegin(new ListNode(50));
		System.out.println(list.getHead().getData());
	}
}
