package IPK.linkedlist;

import IPK.tree.Node;

public class DeleteAtBeginSLL {

    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        head.getNext().setNext(new SLNode(30));
        CreateAndPrintSLL.printLL(deleteAtBegin(head));
    }

    public static SLNode deleteAtBegin(SLNode head) {
        if (head == null) return null;
        return head.getNext();
    }
}
