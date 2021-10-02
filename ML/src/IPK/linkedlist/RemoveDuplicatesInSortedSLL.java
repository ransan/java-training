package IPK.linkedlist;

public class RemoveDuplicatesInSortedSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().getNext().setNext(new SLNode(30));
        CreateAndPrintSLL.printLL(detectAndRemove(slNode));
    }

    public static SLNode detectAndRemove(SLNode slNode) {
        if (slNode == null) return null;
        SLNode current = slNode;
        while (current != null && current.getNext() != null ) {
            if (current.getValue() == current.getNext().getValue()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
        return slNode;
    }
}
