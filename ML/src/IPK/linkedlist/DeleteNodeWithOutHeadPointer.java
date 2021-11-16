package IPK.linkedlist;

public class DeleteNodeWithOutHeadPointer {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(new SLNode(40));
        deletePos(slNode.getNext());
        CreateAndPrintSLL.printLL(slNode);
    }

    public static void deletePos(SLNode slNode) {
        if (slNode == null) {
            return;
        } else {
            if (slNode.getNext() == null) {
                return;
            }
        }
        SLNode temp = slNode.getNext(); // node.next;
        slNode.setValue(slNode.getNext().getValue()); // node.data = node.next.data;
        slNode.setNext(slNode.getNext().getNext()); // node.next = node.next.next;
    }
}
