package IPK.linkedlist;

public class InsertAtBeginSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        SLNode newHead = insertAtBegin(head, 5);
        CreateAndPrintSLL.printLL(newHead);
    }

    public static SLNode insertAtBegin(SLNode head, int node) {
        SLNode newHead = new SLNode(node);
        newHead.setNext(head);
        return newHead;
    }
}
