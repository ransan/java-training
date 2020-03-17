package linked_list;

public class LinkedList {
	ListNode head;
	public LinkedList() {
		length=0;
	}
	private int length =0;

	public synchronized ListNode getHead() {
		return head;
	}
	
	public synchronized void insertAtBegin(ListNode node) {
		if(head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
			length++;
		}
	}
}
