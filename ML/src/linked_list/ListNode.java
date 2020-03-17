package linked_list;

public class ListNode {
	private int data;
	private ListNode next;

	public ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return this.next;
	}

	public void setNext(ListNode node) {
		this.next = node;
	}
}
