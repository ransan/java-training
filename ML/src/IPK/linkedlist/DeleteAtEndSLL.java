package IPK.linkedlist;

public class DeleteAtEndSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        head.getNext().setNext(new SLNode(30));
        head.getNext().getNext().setNext(new SLNode(40));
        CreateAndPrintSLL.printLL(deleteAtEnd(head));
    }

    private static SLNode deleteAtEnd(SLNode head) {
        if (head == null) return null;
        if (head.getNext() == null) return null;
        SLNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        return head;
    }
}
