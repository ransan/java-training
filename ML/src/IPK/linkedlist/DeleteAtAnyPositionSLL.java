package IPK.linkedlist;

public class DeleteAtAnyPositionSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        CreateAndPrintSLL.printLL(delete(slNode, 2));
    }

    private static SLNode delete(SLNode slNode, int pos) {
        if (slNode == null) return null;
        if (pos == 1) {
            return slNode.getNext();
        }
        SLNode current = slNode;
        for (int i = 1; i <= pos - 2 && current.getNext() != null; i++) {
            current = current.getNext();
        }
        if (current == null) return slNode;
        SLNode newNext = current.getNext().getNext();
        current.setNext(newNext);
        return slNode;
    }
}
