package IPK.linkedlist;

public class ReverseSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(new SLNode(40));
        CreateAndPrintSLL.printLL(reverse(slNode));
    }

    private static SLNode reverse(SLNode slNode) {
        if (slNode == null) return null;
        SLNode current = slNode;
        SLNode previous = null;

        while(current != null) {
            SLNode next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
}
