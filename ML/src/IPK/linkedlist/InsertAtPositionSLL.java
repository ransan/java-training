package IPK.linkedlist;

public class InsertAtPositionSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        head.getNext().setNext(new SLNode(30));
        CreateAndPrintSLL.printLL(insert(head, 40, 2));
    }

    public static SLNode insert(SLNode head, int value, int pos) {
        SLNode temp = new SLNode(value);
        if (pos == 1) {
            temp.setNext(head);
            return temp;
        }
        SLNode current = head;
        for (int i = 1; i <= pos - 2 && current != null; i++) {
            current = current.getNext();
        }
        if (current == null) return head;
        temp.setNext(current.getNext());
        current.setNext(temp);
        return head;
    }
}
