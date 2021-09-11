package IPK.linkedlist;

public class InsertAtEndSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        SLNode newHead = insertAtEnd(head, 30);
        CreateAndPrintSLL.print(newHead);
    }

    public static SLNode insertAtEnd(SLNode slNode, int value) {
        SLNode head = new SLNode(value);
        if (slNode == null) return head;
        SLNode current = slNode;
        CreateAndPrintSLL.printLL(current);
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new SLNode(value));
        current.getNext().setNext(null);
        return slNode;
    }
}
